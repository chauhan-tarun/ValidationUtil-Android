package com.util.validation

import android.util.Patterns

/**
 * A ValidationUtil library class to help you optimize your code
 * and easily implement **validations** on your text fields.
 */

object ValidationUtil {

    private fun checkInput(value: String?): Boolean {
        return !(value == null || value.isEmpty())
    }

    fun isValidName(name: String): Boolean {

        return checkInput(name.trim()) && name.matches("[a-zA-Z ]*")
    }

    fun isValidUsername(username: String): Boolean {

        return checkInput(username) && username.matches("^[a-zA-Z0-9._-]*$")
    }

    fun isValidEmail(email: String): Boolean {

        return checkInput(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun isValidPhone(phone: String): Boolean {

        return checkInput(phone) && Patterns.PHONE.matcher(phone).matches()
    }

    fun isValidPassword(password: String, minLength: Int): Boolean {

        return checkInput(password) && password.matches("^[a-zA-Z0-9@#$%^&+=]{$minLength,}$")
    }

}
