package com.premsinghdaksha.spotsprogressdialog;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.premsinghdaksha.spots_progress_dialog.SpotsProgressDialog;


public class MainActivity extends AppCompatActivity {
    private SpotsProgressDialog progressDialog;
    public Button sportsPrgDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = (SpotsProgressDialog) new SpotsProgressDialog.Builder()
                .setContext(MainActivity.this)
                .setMessage("Please wait, processing...")
                .setCancelable(false)
                .build();
        progressDialog.show();


        sportsPrgDialog = findViewById(R.id.sportsPrgDialog);
        sportsPrgDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"click",Toast.LENGTH_SHORT);
                progressDialog = (SpotsProgressDialog) new SpotsProgressDialog.Builder()
                        .setContext(MainActivity.this)
                        .setMessage("Please wait, processing...")
                        .setCancelable(false)
                        .build();
                progressDialog.show();
                progress();
            }
        });
        progress();


    }

    private void progress() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDialog.dismiss();
            }
        }, 10000);
    }
}