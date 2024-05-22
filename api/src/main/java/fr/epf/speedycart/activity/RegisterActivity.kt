package fr.epf.speedycart.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val createAccountButton: Button = findViewById(R.id.create_account_button)

        createAccountButton.setOnClickListener {
            // Handle account creation logic here
            Toast.makeText(this, "Create Account button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
