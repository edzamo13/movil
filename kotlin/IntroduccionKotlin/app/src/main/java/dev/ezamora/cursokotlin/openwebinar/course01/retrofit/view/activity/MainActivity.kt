package dev.ezamora.cursokotlin.openwebinar.course01.retrofit.view.activity

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.birbit.android.jobqueue.JobManager
import com.birbit.android.jobqueue.Params
import com.birbit.android.jobqueue.config.Configuration
import dev.ezamora.cursokotlin.R
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.model.ItemModel
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.task.GetResourceListJob
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.view.adapter.ItemAdapter
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.view.contract.MainView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_retrofit_job.*

class MainActivity : AppCompatActivity(), MainView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()
    }

    fun loadData() {
        val builder = Configuration.Builder(this)
            .minConsumerCount(1)
            .maxConsumerCount(3)
            .loadFactor(3)
            .consumerKeepAlive(120)

        val jobManager = JobManager(builder.build())
        val serviceJob = GetResourceListJob(Params(50).requireNetwork(), this)
        jobManager.addJobInBackground(serviceJob)
        jobManager.start()
    }

    override fun setDataSet(items: List<ItemModel>) {
        loadingView.visibility = View.GONE
        mainRecycler.visibility = View.VISIBLE
        mainRecycler.layoutManager = LinearLayoutManager(this)
        mainRecycler.adapter = ItemAdapter(items) {
            toast(String.format("Click en %s", it.farmerId))
        }
    }

    fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}