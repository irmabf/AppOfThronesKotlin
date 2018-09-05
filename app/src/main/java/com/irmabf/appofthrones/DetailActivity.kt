package com.irmabf.appofthrones

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            //Toast needs a context, a connection with the controllers, that context needs to reference the current class, in this case, DetailActivity
            Toast.makeText(this@DetailActivity, "Winter is coming", Toast.LENGTH_SHORT).show()
        }

    }
}
