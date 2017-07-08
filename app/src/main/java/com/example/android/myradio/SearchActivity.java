package com.example.android.myradio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        View statusLayout = findViewById(R.id.music_status_search);
        Button btn = (Button)statusLayout.findViewById(R.id.btn_go_to_player);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}
