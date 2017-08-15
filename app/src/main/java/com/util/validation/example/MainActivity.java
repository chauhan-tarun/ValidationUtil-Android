package com.util.validation.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.util.validation.ValidationUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void RegisterUser(View view) {
        checkViews();

    }

    private void checkViews(){
        EditText et_name, et_email, et_number, et_password;

        et_name = (EditText) findViewById(R.id.et_name);
        et_email = (EditText) findViewById(R.id.et_email);
        et_number = (EditText) findViewById(R.id.et_number);
        et_password = (EditText) findViewById(R.id.et_password);

        if(!ValidationUtil.isValidName(et_name.getText().toString())){
            Toast.makeText(this, "Name is not valid", Toast.LENGTH_SHORT).show();
        }else if(!ValidationUtil.isValidEmail(et_email.getText().toString())){
            Toast.makeText(this, "Email is not valid", Toast.LENGTH_SHORT).show();
        }else if(!ValidationUtil.isValidPhone(et_number.getText().toString())){
            Toast.makeText(this, "Number is not valid", Toast.LENGTH_SHORT).show();
        }else if(!ValidationUtil.isValidPassword(et_password.getText().toString(),8)){
            Toast.makeText(this, "Password is not valid", Toast.LENGTH_SHORT).show();
        }
    }
}
