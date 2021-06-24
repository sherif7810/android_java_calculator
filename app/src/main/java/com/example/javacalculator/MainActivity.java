package com.example.javacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.editText);
    }


    public void buttonClicked(View view) {
        mEditText.setText(mEditText.getText().append(((Button) view).getText()));
    }
}