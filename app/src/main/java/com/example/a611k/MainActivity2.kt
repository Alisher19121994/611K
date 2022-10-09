package com.example.a611k

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.intellij.lang.annotations.Language
import java.util.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initViews()
    }

    private fun initViews() {
        val uz_button: Button = findViewById(R.id.b_uzbek)
        val ja_button: Button = findViewById(R.id.b_japanese)
        val ko_button: Button = findViewById(R.id.b_korean)
        val zh_button: Button = findViewById(R.id.b_chinese)


        uz_button.setOnClickListener { setLocale("uz") }
        ja_button.setOnClickListener { setLocale("ja") }
        ko_button.setOnClickListener { setLocale("ko") }
        zh_button.setOnClickListener { setLocale("zh") }

    }

    private fun setLocale(language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)

        val configuration = Configuration()
        configuration.locale = locale

        baseContext.resources.updateConfiguration(
            configuration, baseContext.resources.displayMetrics
        )
        finish()

    }


}