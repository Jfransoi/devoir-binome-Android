package com.jfcodes.plateformesupinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.jfcodes.plateformesupinfo.ui.login.LoginEtudiant;
import com.jfcodes.plateformesupinfo.ui.login.LoginProfesseur;


public class MainActivity extends AppCompatActivity  {

    private Button btnConEtudiant;
    private Button btnConProfesseur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btnConEtudiant = findViewById(R.id.btnLogEtudiant);
        btnConProfesseur = findViewById(R.id.btnLogProf);

        btnConEtudiant.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent switchLogEtudiant = new Intent( MainActivity.this, LoginEtudiant.class);
                startActivity(switchLogEtudiant);
            }
        });


        btnConProfesseur.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent switchLogProfesseur = new Intent( MainActivity.this, LoginProfesseur.class);
                startActivity(switchLogProfesseur);
            }
        });


    }


}