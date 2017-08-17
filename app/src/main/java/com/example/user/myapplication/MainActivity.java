package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =(EditText) findViewById(R.id.inputField);


    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button3:
                editText.setText("Hello from the Moon");
                break;
        }

    }
}
