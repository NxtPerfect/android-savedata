package com.example.zapiszdane;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save_on_click(View view) {
        EditText nameView = (EditText) findViewById(R.id.name);
        EditText surnameView = (EditText) findViewById(R.id.surname);
        EditText phoneView = (EditText) findViewById(R.id.phone);
        EditText emailView = (EditText) findViewById(R.id.email);

        String name = nameView.getText().toString();
        String surname = surnameView.getText().toString();
        String phone = phoneView.getText().toString();
        String email = emailView.getText().toString();

       TextView resultView = (TextView) findViewById(R.id.result);
       resultView.setText(MessageFormat.format("{0}: {1}\n{2}: {3}\n{4}: {5}\n{6}: {7}", getString(R.string.name), name, getString(R.string.surname), surname, getString(R.string.phone), phone, getString(R.string.email), email));
    }
}