package com.example.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast




class ccfvMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show()
        // La actividad est� a punto de hacerse visible.
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show()
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show()
        // Enfocarse en otra actividad  (esta actividad est� a punto de ser "detenida").
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show()
        // La actividad ya no es visible (ahora est� "detenida")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show()
        // La actividad est� a punto de ser destruida.
    }

}