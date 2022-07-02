package com.example.hostel_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity {

    CardView cardHome;
    CardView cardMenu;
    CardView cardOut;
    CardView cardStudent;
    CardView cardCom;
    CardView cardLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardHome=findViewById(R.id.cardHome);
        cardMenu=findViewById(R.id.cardMenu);
        cardCom =findViewById(R.id.cardCom);
        cardStudent =findViewById(R.id.cardStudent);
        cardOut =findViewById(R.id.cardOut);
        cardLogout=findViewById(R.id.cardLogout);

        cardHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Home Clicked");
            }
        });

        cardMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMenuActivity();

            }
        });

        cardCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Complaints Clicked");
            }
        });

        cardStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Student details Clicked");
            }
        });

        cardOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Outing Clicked");
            }
        });

        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Logout Clicked");
            }
        });

    }

    private void startMenuActivity() {
        Intent intent = new Intent(Home.this,Menu.class);
        startActivity(intent);
    }

    private void showToast(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}