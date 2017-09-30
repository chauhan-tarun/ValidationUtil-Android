# ValidationUtil - Android
A Validation Util class for adding validations to input fields in Android

Clone or Download this sample code to get started :wink:

### Usage
1. For *java* add [ValidationUtilJava.java](app/src/main/java/com/util/validation/example/ValidationUtilJava.java) and for *kotlin* add [ValidationUtil.kt](app/src/main/java/com/util/validation/example/ValidationUtil.kt) into your project
2. In your MainActivity.java(or MainActivity.kt) write below code to check for validations
```
    if (ValidationUtil.isValidUsername(this, et_username.text.toString())
            && ValidationUtil.isValidEmail(this, et_email.text.toString())
            && ValidationUtil.isValidMobile(this, et_number.text.toString())
            && ValidationUtil.isValidPassword(this, et_password.text.toString())) {

        // All inputs are valid and we can go ahead and perform our further functions
        ValidationUtil.showToast(this, "All fields are correct :)");

    }

```
