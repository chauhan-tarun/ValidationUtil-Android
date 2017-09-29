package com.util.validation.example;

import android.content.Context;
import android.util.Patterns;
import android.widget.Toast;

import java.util.regex.Pattern;

/**
 * Created by pchub on 29-09-2017.
 * <p>
 * A Simple ValidationUtil class that can validate your inputs
 * and can display the error messages on its own so that you
 * don't have to bother adding multiple if-else-if statements
 * and Toasts for your Validations.
 * <p>
 * Of course you can modify this file according to your needs
 * and implement more methods here to improve the validation of this class.
 * <p>
 * <b>*Note*</b>
 * <pre>
 *     Do not save your activity's context in this class as it will lead to memory leak.
 *     Only pass your activity's context to the parameters and avoid keeping reference
 *     of the activity stored inside this class.
 * </pre>
 */

public class ValidationUtilJava {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static boolean isNullOrEmpty(String input) {
        return input == null || input.isEmpty();
    }

    public static boolean isValidUsername(Context context, String username) {
        return isValidUsername(context, username, "^[a-zA-Z0-9._-]{3,20}$");
    }

    public static boolean isValidUsername(Context context, String username, String regex) {
        if (isNullOrEmpty(username)) {
            showToast(context, "Please enter User name first.");
        } else if (!Pattern.matches(regex, username)) {
            showToast(context, "Please enter a valid User name.");
        } else {
            return true;
        }
        return false;
    }

    public static boolean isValidEmail(Context context, String email) {
        if (isNullOrEmpty(email)) {
            showToast(context, "Please enter Email first.");
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            showToast(context, "Please enter a valid Email address.");
        } else {
            return true;
        }
        return false;
    }

    public static boolean isValidMobile(Context context, String mobile) {
        return isValidMobile(context, mobile, "^[0-9]{10}$");
    }

    public static boolean isValidMobile(Context context, String mobile, String regex) {
        if (isNullOrEmpty(mobile)) {
            showToast(context, "Please enter Mobile number first.");
        } else if (!Pattern.matches(regex, mobile)) {
            showToast(context, "Please enter a valid Mobile number.");
        } else {
            return true;
        }
        return false;
    }

    public static boolean isValidPassword(Context context, String password) {
        if (isNullOrEmpty(password)) {
            showToast(context, "Please enter Password first.");
        } else if (password.length() < 6) {
            showToast(context, "Password length should not be less than 6 characters");
        } else if (password.length() > 30) {
            showToast(context, "Password length should not be greater than 30 characters");
        } else {
            return true;
        }
        return false;
    }

}
