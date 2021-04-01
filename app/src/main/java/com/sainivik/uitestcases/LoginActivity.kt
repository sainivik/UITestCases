package com.sainivik.uitestcases

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sainivik.uitestcases.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        addListener()

    }

    private fun addListener() {
        binding.btnLogin.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (binding.edtEmail.text.toString() == "abcd@gmail.com"
                    && binding.edtPass.getText().toString() == "abcd123"
                ) {
                    binding.tvResult.text = "LOGIN SUCCESS!"
                } else {
                    binding.tvResult.text = "LOGIN FAILED"
                }
            }
        })
    }

}