package com.example.displayjokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String KEY_JOKE_EXTRA = "JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke;
        if (getIntent().hasExtra(KEY_JOKE_EXTRA)){
            joke = getIntent().getStringExtra(KEY_JOKE_EXTRA);
        } else {
            joke = getString(R.string.no_joke_found);
        }

        TextView jokeTv = findViewById(R.id.joke_tv);
        jokeTv.setText(joke);
    }
}
