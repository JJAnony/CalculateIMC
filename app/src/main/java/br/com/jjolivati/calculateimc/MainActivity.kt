package br.com.jjolivati.calculateimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        calculateButton.setOnClickListener {
            calculate(textInputWeight.text.toString(), textInputHeight.text.toString())
        }
    }

    private fun calculate(weight: String, height: String) {
        val weight = weight.toFloatOrNull()
        val height = height.toFloatOrNull()

        if (weight != null && height != null) {
            val imc = weight / (height * height)
            result.text = "Seu Imc é %.2f".format(imc)
        }

    }

}