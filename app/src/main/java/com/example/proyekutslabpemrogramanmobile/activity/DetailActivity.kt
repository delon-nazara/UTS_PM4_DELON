package com.example.proyekutslabpemrogramanmobile.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyekutslabpemrogramanmobile.R
import com.google.android.material.appbar.MaterialToolbar

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val topAppBar = findViewById<MaterialToolbar>(R.id.topAppBar)
        setSupportActionBar(topAppBar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        topAppBar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                finish()
            }
        })

        val logoId = intent.getIntExtra("LOGO_ID", 0)
        val name = intent.getStringExtra("NAME")
        val creator = intent.getStringExtra("CREATOR")
        val yearReleased = intent.getStringExtra("YEAR_RELEASED")
        val fileExtension = intent.getStringExtra("FILE_EXTENSION")
        val useCases = intent.getStringExtra("USE_CASES")
        val description = intent.getStringExtra("DESCRIPTION")
        val documentationLink = intent.getStringExtra("DOCUMENTATION_LINK")

        val imageViewLogo = findViewById<ImageView>(R.id.imageViewLogo)
        imageViewLogo.setImageResource(logoId)
        imageViewLogo.contentDescription = name
        findViewById<TextView>(R.id.textViewName).text = name
        findViewById<TextView>(R.id.textViewCreator).text = creator
        findViewById<TextView>(R.id.textViewYearReleased).text = yearReleased
        findViewById<TextView>(R.id.textViewFileExtension).text = fileExtension
        findViewById<TextView>(R.id.textViewUseCases).text = useCases
        findViewById<TextView>(R.id.textViewDescription).text = description
        val textViewDocumentationLink = findViewById<TextView>(R.id.textViewDocumentationLink)
        textViewDocumentationLink.text = documentationLink

        textViewDocumentationLink.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(documentationLink))
            val chooser = Intent.createChooser(intent, getString(R.string.choose_browser))
            startActivity(chooser)
        }
    }
}