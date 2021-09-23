package edu.temple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Validators.not
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val EditTextName = findViewById<EditText>(R.id.editTextName)
        val EditTextUser = findViewById<EditText>(R.id.editTextUser)
        val EditTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val EditTextPass = findViewById<EditText>(R.id.editTextPassword)
        val EditTextConfirm = findViewById<EditText>(R.id.editTextConfirm)
        val button = findViewById<Button>(R.id.button).setOnClickListener {
            val name = EditTextName.text
            val user = EditTextUser.text
            val email = EditTextEmail.text
            val pass = EditTextPass.text
            val confirm = EditTextConfirm.text
            var count = 0

            if(name.toString().isNotEmpty()){
                count++
            }else{
                EditTextName.error = "Name is Empty"
            }
            if(user.toString().isNotEmpty()){
                count++
            }else{
                EditTextUser.error = "Username Is Empty"
            }
            if(email.toString().isNotEmpty()){
                count++
            }else{
                EditTextEmail.error = "Email is Empty"
            }
            if(pass.toString().isNotEmpty()){
                count++
            }else{
                EditTextPass.error = "Password is Empty"
            }
            if(confirm.toString().isNotEmpty()){
                count++
            }else{
                EditTextConfirm.error = "Password Confirmation is Empty"
            }
            if((!pass.toString().equals(confirm.toString()))){
                if(EditTextPass.error == null){
                    EditTextPass.error = "Your Password does not match"
                }
                if(EditTextConfirm.error == null){
                    EditTextConfirm.error = "Your Password does not match"
                }
            }else{
                count++
            }
            if(count == 6){
                Toast.makeText(this, "Welcome To Sign Up Form", Toast.LENGTH_SHORT).show()
            }

        }




    }
}