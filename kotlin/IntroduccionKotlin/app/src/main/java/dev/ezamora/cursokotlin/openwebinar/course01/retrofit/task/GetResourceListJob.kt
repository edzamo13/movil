package dev.ezamora.cursokotlin.openwebinar.course01.retrofit.task

import android.os.Handler
import com.birbit.android.jobqueue.Job
import com.birbit.android.jobqueue.Params
import com.birbit.android.jobqueue.RetryConstraint
import android.os.Looper
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.model.mapper.ItemMapper
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.view.contract.MainView
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.ws.ApiUtils
import dev.ezamora.cursokotlin.openwebinar.course01.retrofit.ws.ResourceService

class GetResourceListJob(params: Params?, private val view: MainView) : Job(params) {
    override fun onRun() {
        val resourceService = ApiUtils.generateRetrofitInstance()
            .create(ResourceService::class.java)
        val call = resourceService.requestResourceList("Fruit", "Peaches")

        val result = call.execute().body()
        val items = ItemMapper().transform(result!!)

        val uiHandler = Handler(Looper.getMainLooper())
        val runnable = Runnable {
            view.setDataSet(items)
        }
        uiHandler.post(runnable)
    }

    override fun shouldReRunOnThrowable(throwable: Throwable, runCount: Int, maxRunCount: Int): RetryConstraint {
        return RetryConstraint(false)
    }

    override fun onAdded() {

    }

    override fun onCancel(cancelReason: Int, throwable: Throwable?) {

    }
}
