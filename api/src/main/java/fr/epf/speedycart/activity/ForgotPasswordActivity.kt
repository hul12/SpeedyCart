package fr.epf.speedycart.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val resetPasswordButton: Button = findViewById(R.id.reset_password_button)
        val returnToLogin: TextView = findViewById(R.id.return_to_login)
        val emailField: EditText = findViewById(R.id.reset_email)

        resetPasswordButton.setOnClickListener {
            val email = emailField.text.toString()
            // Handle password reset logic here
            Toast.makeText(this, "Reset Password button clicked", Toast.LENGTH_SHORT).show()
        }

        returnToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Returning to LoginActivity", Toast.LENGTH_SHORT).show()
        }
    }
}
