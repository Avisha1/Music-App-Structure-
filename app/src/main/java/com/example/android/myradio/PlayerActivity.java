package com.example.android.myradio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);


        View viewStatus = findViewById(R.id.music_status_player);
        Button btnDownload = (Button)viewStatus.findViewById(R.id.btn_download_song);

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayerActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}
