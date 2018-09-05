package com.irmabf.appofthrones

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                //Toast needs a context, a connection between the SO and the controllers,
                //that context needs to reference the current class, in this case, MainActivity
                Toast.makeText(this@MainActivity, "Winter is coming", Toast.LENGTH_SHORT).show()
            }

        })

    }
}
