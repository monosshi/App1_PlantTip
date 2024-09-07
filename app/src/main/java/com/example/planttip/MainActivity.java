package com.example.planttip;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button clickbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        clickbtn=findViewById(R.id.info_btn);

        clickbtn.setOnClickListener(v->{

            Toast.makeText(MainActivity.this, "Showing some indoor plants!", Toast.LENGTH_SHORT).show();


            Intent intent=new Intent(MainActivity.this,InfoActivity.class);
            startActivity(intent);

        });

    }
}