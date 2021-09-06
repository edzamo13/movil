package dev.ezamora.cursokotlin.google.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import dev.ezamora.cursokotlin.R
import dev.ezamora.cursokotlin.databinding.ActivityCalculatorBinding
import java.text.NumberFormat
import kotlin.jvm.internal.Intrinsics


class CalculatorActivity : AppCompatActivity() {

  private   lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_calculator)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener{calculateTip()}

    }

    @SuppressLint("StringFormatInvalid")
    private fun calculateTip() {
        val stringInTextField = binding.costOfService.text.toString()
        val cost= stringInTextField.toDoubleOrNull()
        if (cost== null){
            binding.tipResult.text=""
            return
        }
        //val selectedId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId){
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost
        if (binding.roundUpSwitch.isChecked){
            tip = kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)

    }

}

