package com.util.validation;

import android.util.Patterns;

/**
 * A ValidationUtil library class to help you optimize your code
 * and easily implement <b>validations</b> on your text fields.
 */

public class ValidationUtil {

    public static boolean isValidName(String name) {

        return checkInput(name.trim()) && name.matches("[a-zA-Z ]*");
    }

    public static boolean isValidUsername(String username) {

        return checkInput(username) && username.matches("^[a-zA-Z0-9._-]*$");
    }

    public static boolean isValidEmail(String email) {

        return checkInput(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public static boolean isValidPhone(String phone) {

        return checkInput(phone) && Patterns.PHONE.matcher(phone).matches();
    }

    public static boolean isValidPassword(String password, int minLength) {

        return checkInput(password) && password.matches("^[a-zA-Z0-9@#$%^&+=]{"+minLength+",}$");
    }

    private static boolean checkInput(String value) {
        return !(value == null || value.isEmpty());
    }

}
