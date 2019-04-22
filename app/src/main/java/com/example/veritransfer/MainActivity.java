package com.example.veritransfer;

import android.content.Intent;
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


        editText = findViewById(R.id.editText);
    }

    String userName = "";



    public void dataTransfer(View view) {

        userName = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);

        intent.putExtra("userINput",userName);

        startActivity(intent);


    }


}
