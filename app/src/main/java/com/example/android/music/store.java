package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class store extends AppCompatActivity {
    Button songs;
    Button fav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        songs = (Button) findViewById(R.id.songs);

        fav = (Button) findViewById(R.id.fav);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(store.this, MainActivity.class);

                startActivity(intent);
                finish();
            }
        });


        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(store.this, favorite.class);

                startActivity(intent);
                finish();
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
            {   finish();
                Intent intent = new Intent(store.this, MainActivity.class);

                startActivity(intent);
                break;}

        }
        return super.onOptionsItemSelected(item);
    }
}
