package com.util.validation.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button click listener
        b_checkInput.setOnClickListener({

            // Here we will use the Validation Util to validate our input fields
            // which will also show Toast messages to the user when there is an issue
            // in the input field.
            if (ValidationUtil.isValidUsername(this, et_username.text.toString())
                    && ValidationUtil.isValidEmail(this, et_email.text.toString())
                    && ValidationUtil.isValidMobile(this, et_number.text.toString())
                    && ValidationUtil.isValidPassword(this, et_password.text.toString())) {

                // All inputs are valid and we can go ahead and perform our further functions
                ValidationUtil.showToast(this, "All fields are correct :)")

            }

        })

    }
}
