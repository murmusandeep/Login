package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEmail;
    private EditText mPassword;

    private Button mLogin;

    private TextView mNoOfAttempt;
    private TextView mCreateAccount;
    private TextView mForgotPassword;

    private int mCounter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mEmail = findViewById(R.id.input_email);
        mPassword = findViewById(R.id.input_password);

        mLogin = findViewById(R.id.btn_login);

        mNoOfAttempt = findViewById(R.id.tvInfo);
        mCreateAccount = findViewById(R.id.registerText);
        mForgotPassword = findViewById(R.id.forgotPassword);
        
        mNoOfAttempt.setText("No of Attempts Remaining is : 5");

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(mEmail.getText().toString(), mPassword.getText().toString());
            }
        });
    }

    private void validate(String username, String password) {
        if(username.equals("admin") && password.equals("12345")) {
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
        else {

            mCounter--;

            mNoOfAttempt.setText("No of Attempt Remaining :" + String.valueOf(mCounter));

            if (mCounter == 0) {
                mLogin.setEnabled(false);
            }
        }
    }
}