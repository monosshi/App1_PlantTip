package com.example.planttip;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InfoActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_info);

        img1=findViewById(R.id.plant1Image);
        img2=findViewById(R.id.plant2Image);
        img3=findViewById(R.id.plant3Image);
        img4=findViewById(R.id.plant4Image);
        btn=findViewById(R.id.back_button);

        img1.setOnClickListener(V->{

            Toast.makeText(InfoActivity.this, "Water your Money Plant when the soil is dry.", Toast.LENGTH_SHORT).show();
        });

        img2.setOnClickListener(V->{

            Toast.makeText(InfoActivity.this, "Water when soil is dry, prefer bright indirect light, and avoid overwatering.", Toast.LENGTH_SHORT).show();


        });

        img3.setOnClickListener(V->{

            Toast.makeText(InfoActivity.this, "Spider Plants thrive in bright, indirect light.", Toast.LENGTH_SHORT).show();


        });

        img4.setOnClickListener(V->{

            Toast.makeText(InfoActivity.this, "Let soil dry completely between waterings, thrives in low to bright indirect light, and needs minimal care.", Toast.LENGTH_SHORT).show();

        });

        btn.setOnClickListener(V->{
            Intent intent=new Intent(InfoActivity.this,MainActivity.class);
            startActivity(intent);
        });

    }
}