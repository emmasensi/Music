package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button fav;
    Button store;
    Button play;
    Button song1ad;
    Button song2ad;
    Button song3ad;
    Button song4ad;
    Button song5ad;
    Button song6ad;
    ImageView playsong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        fav = (Button) findViewById(R.id.fav);

        store = (Button) findViewById(R.id.store);
        play = (Button) findViewById(R.id.play);
        song1ad = (Button) findViewById(R.id.song1ad);
        song2ad = (Button) findViewById(R.id.song2ad);
        song3ad = (Button) findViewById(R.id.song3ad);
        song4ad = (Button) findViewById(R.id.song4ad);
        song5ad = (Button) findViewById(R.id.song5ad);
        song6ad = (Button) findViewById(R.id.song6ad);

        playsong = (ImageView) findViewById(R.id.playsong);

        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, favorite.class);

                startActivity(intent);
                finish();


            }
        });


        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, store.class);

                startActivity(intent);
                finish();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, playing.class);

                startActivity(intent);

                finish();


            }
        });

        song1ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = song1ad.getText().toString();
                Intent intent = new Intent(MainActivity.this, playing.class);
                intent.putExtra("MESSAGE", ad);

                startActivity(intent);

            }
        });
        song2ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ad = song2ad.getText().toString();
                Intent intent = new Intent(MainActivity.this, playing.class);
                intent.putExtra("MESSAGE", ad);

                startActivity(intent);

            }
        });
        song3ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ad = song3ad.getText().toString();
                Intent intent = new Intent(MainActivity.this, playing.class);
                intent.putExtra("MESSAGE", ad);

                startActivity(intent);

            }
        });
        song4ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ad = song4ad.getText().toString();
                Intent intent = new Intent(MainActivity.this, playing.class);
                intent.putExtra("MESSAGE", ad);

                startActivity(intent);

            }
        });
        song5ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ad = song5ad.getText().toString();
                Intent intent = new Intent(MainActivity.this, playing.class);
                intent.putExtra("MESSAGE", ad);

                startActivity(intent);

            }
        });

        song6ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ad = song6ad.getText().toString();
                Intent intent = new Intent(MainActivity.this, playing.class);
                intent.putExtra("MESSAGE", ad);

                startActivity(intent);

            }
        });

    }

}
