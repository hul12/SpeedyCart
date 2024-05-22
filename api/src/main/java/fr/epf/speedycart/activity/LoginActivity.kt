package fr.epf.speedycart.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: Button = findViewById(R.id.login_button)
        val createAccount: TextView = findViewById(R.id.create_account)
        val forgotPassword: TextView = findViewById(R.id.forgot_password)

        loginButton.setOnClickListener {
            // Handle login logic here
            Toast.makeText(this, "Login button clicked", Toast.LENGTH_SHORT).show()
        }

        createAccount.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Navigating to RegisterActivity", Toast.LENGTH_SHORT).show()
        }

        forgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Navigating to ForgotPasswordActivity", Toast.LENGTH_SHORT).show()
        }
    }
}
