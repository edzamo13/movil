package dev.ezamora.cursokotlin.openwebinar.course01.lambdas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import dev.ezamora.cursokotlin.R
import kotlinx.android.synthetic.main.activity_lambdas.*

class LambdasActivity : AppCompatActivity() {

    // var btnUsoLambda: Button = findViewById(R.id.btnLambdas)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lambdas)


        btnUsoLambda.setOnClickListener{
            val text = editTxtUsoLambda.text.toString()
            val number = if (text.count() > 0) text.toInt() else 0
            processNumber(number, {
                editTxtUsoLambda.setTextColor(Color.RED)
            }, {
                editTxtUsoLambda.setTextColor(Color.GREEN)
            })

        }


    }

    private inline fun processNumber(number: Int,  excuteIfIsPair: () -> Unit, executeIfNot: () -> Unit) {
        if (number % 2 == 0) excuteIfIsPair() else executeIfNot()
    }

}