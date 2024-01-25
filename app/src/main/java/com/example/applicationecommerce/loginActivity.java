package com.example.applicationecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signUp(View view) {
        startActivities(new Intent(loginActivity.this,MainActivity.class));
    }

    private void startActivities(Intent intent) {
    }

    public void signIn(View view) {
        startActivities(new Intent(loginActivity.this,RegistrationActivity.class));
    }
}