package dev.ezamora.cursokotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.ezamora.cursokotlin.google.calculator.CalculatorActivity
import dev.ezamora.cursokotlin.google.dice.DiceActivity
import dev.ezamora.cursokotlin.openwebinar.course01.example.list.ListOpenWebinarActivity
import dev.ezamora.cursokotlin.openwebinar.course01.basic.BasicConcept
import dev.ezamora.cursokotlin.openwebinar.course01.basic.Colecciones
import dev.ezamora.cursokotlin.openwebinar.course01.basic.Extenciones

import dev.ezamora.cursokotlin.openwebinar.course01.basic.ClassAndConstructor
import dev.ezamora.cursokotlin.openwebinar.course01.example.fuctionextencion.FuctionExtencionActivity
import dev.ezamora.cursokotlin.openwebinar.course01.lambdas.LambdasActivity
import dev.ezamora.cursokotlin.openwebinar.course01.recyclerView.ReciclerViewActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    val TAG = ":::TAG"
    var classAndConstructor = ClassAndConstructor();
    var basicConcept = BasicConcept();
    var extenciones = Extenciones();
    var colleciones = Colecciones();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnListOpenWebinar: Button = findViewById(R.id.btnListOpenWebinar)
        val btnDice: Button = findViewById(R.id.btnDice)
        val btnCalculator: Button = findViewById(R.id.btnCalculator)
        val btnFntExtension: Button = findViewById(R.id.btnFntExtension)
        val btnLambdas: Button = findViewById(R.id.btnLambdas)
        val btnRecyclerView : Button= findViewById(R.id.btnRecyclerView)

        btnListOpenWebinar.setOnClickListener(this)
        btnDice.setOnClickListener(this)
        btnCalculator.setOnClickListener(this)
        btnFntExtension.setOnClickListener(this)
        btnLambdas.setOnClickListener(this)
        btnRecyclerView.setOnClickListener(this)

    }


    private fun basicConcept() {
        //  classAndConstructor.main()
        //  basicConcept.main()
        //extenciones.main()
        // colleciones.main()

    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.id == btnListOpenWebinar.id) {
                //Toast.makeText(this, "HOliiiii", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ListOpenWebinarActivity::class.java).apply {
                }
                startActivity(intent)
            }
            if (v.id == btnDice.id) {
                val intent = Intent(this, DiceActivity::class.java).apply { }
                startActivity(intent)
            }
            if (v.id == btnCalculator.id) {
                val intent = Intent(this, CalculatorActivity::class.java).apply {}
                startActivity(intent)
            }
            if (v.id == btnFntExtension.id) {
                val intent = Intent(this, FuctionExtencionActivity::class.java).apply {}
                startActivity(intent)
            }
            if (v.id == btnLambdas.id) {
                val intent = Intent(this, LambdasActivity::class.java).apply { }
                startActivity(intent)
            }
            if (v.id == btnRecyclerView.id) {
              // Toast.makeText(this,"xxx",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ReciclerViewActivity::class.java).apply { }
                startActivity(intent)
            }
        }

    }


}


