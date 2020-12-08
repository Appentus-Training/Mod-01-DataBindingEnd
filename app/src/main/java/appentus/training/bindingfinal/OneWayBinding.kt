package appentus.training.bindingfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import appentus.training.bindingfinal.databinding.ActivityMainBinding

class OneWayBinding : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        binding.apply {
            greetingTextView.text = "Hello! " + nameEditText.text
        }
    }
}