package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.example.android.music.R.id.song1;

public class favorite extends AppCompatActivity {
    Button songs;
    Button store;
    Button song1ad;
    Button song2ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        songs = (Button) findViewById(R.id.songs);

        store = (Button) findViewById(R.id.store);
        song1ad = (Button) findViewById(R.id.song1ad);
        song2ad = (Button) findViewById(R.id.song2ad);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(favorite.this, MainActivity.class);

                startActivity(intent);
                finish();
            }
        });


        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(favorite.this, store.class);

                startActivity(intent);
                finish();
            }
        });
        song1ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = song1ad.getText().toString();
                Intent intent = new Intent(favorite.this, playing.class);
                intent.putExtra("MESSAGE", ad);
                intent.putExtra("Image", song1);
                startActivity(intent);

            }
        });
        song2ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ad = song2ad.getText().toString();
                Intent intent = new Intent(favorite.this, playing.class);
                intent.putExtra("MESSAGE", ad);

                startActivity(intent);

            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
            {   finish();
                Intent intent = new Intent(favorite.this, MainActivity.class);

                startActivity(intent);
                break;}

        }
        return super.onOptionsItemSelected(item);
    }
}
