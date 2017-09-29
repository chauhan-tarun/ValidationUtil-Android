package com.util.validation.example

import android.content.Context
import android.util.Patterns
import android.widget.Toast
import java.util.regex.Pattern

/**
 * Created by pchub on 29-09-2017.
 *
 * A Simple ValidationUtil class that can validate your inputs
 * and can display the error messages on its own so that you
 * don't have to bother adding multiple if-else-if statements
 * and Toasts for your Validations.
 *
 * Of course you can modify this file according to your needs
 * and implement more methods here to improve the validation of this class.
 *
 * <b>*Note*</b>
 * <pre>
 *     Do not save your activity's context in this class as it will lead to memory leak.
 *     Only pass your activity's context to the parameters and avoid keeping reference
 *     of the activity stored inside this class.
 * </pre>
 */
object ValidationUtil {

    public fun showToast(context: Context, message: String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

    public fun isNullOrEmpty(input: String?, toastTag: String = "undefined"): Boolean = input == null || input.isEmpty()

    public fun isValidUsername(context: Context, username: String?, regex: String = "^[a-zA-Z0-9._-]{3,20}$"): Boolean {
        when {
            isNullOrEmpty(username) -> showToast(context, "Please enter User name first.")
            !Pattern.matches(regex, username) -> showToast(context, "Please enter a valid User name.")
            else -> return true
        }
        return false
    }

    public fun isValidEmail(context: Context, email: String?): Boolean {
        when {
            isNullOrEmpty(email) -> showToast(context, "Please enter Email first.")
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> showToast(context, "Please enter a valid Email address.")
            else -> return true
        }
        return false
    }

    public fun isValidMobile(context: Context, mobile: String?, regex: String = "^[0-9]{10}$"): Boolean {
        when {
            isNullOrEmpty(mobile) -> showToast(context, "Please enter Mobile number first.")
            !Pattern.matches(regex, mobile) -> showToast(context, "Please enter a valid Mobile number.")
            else -> return true
        }
        return false
    }

    public fun isValidPassword(context: Context, password: String?): Boolean {
        when {
            isNullOrEmpty(password) -> showToast(context, "Please enter Password first.")
            password!!.length < 6 -> showToast(context, "Password length should not be less than 6 characters")
            password.length > 30 -> showToast(context, "Password length should not be greater than 30 characters")
            else -> return true
        }
        return false
    }
}