package dev.ezamora.cursokotlin.openwebinar.course01.recyclerView

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import dev.ezamora.cursokotlin.R
import kotlinx.android.synthetic.main.activity_list_open_webinar.*

class ReciclerViewActivity : AppCompatActivity() {

    var carList = mutableListOf<CarModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recicler_view)
        initCarList()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        mainList.layoutManager = GridLayoutManager(this, 2)
        mainList.adapter = CarAdapter(carList, {
            toast(String.format("Marca %s", it.id), 500)
        })
    }

    private fun initCarList() {
        for (number in 1 until 100) {
            val id = if (number % 2 == 0) number.toString() else ""
            carList.add(CarModel(id, String.format("Marca %s", number)))
        }
    }
}
