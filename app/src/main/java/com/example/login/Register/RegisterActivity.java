package com.example.login.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.login.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText mRegisterName;
    private EditText mRegisterEmail;
    private EditText mRegisterPassword;

    private Button mSignUp;

    private TextView mRegisterAlready;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    private void setupUIViews() {

    }
}