package com.akb.ivan;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik
    //Tanggal Pengerjaan : 11-5-2020
    //NIM : 10117154
    //Nama: Andi Muhammad Ivan M
    //Kelas : IF-4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke main activity
                Intent main=new Intent(SplashScreen.this, MainActivity.class);
                startActivity(main);
                finish();

            }
        },waktu_loading);
    }
}

