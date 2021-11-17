package com.drakkens.lessson5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

public class Screen2 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        ImageButton imageButton = findViewById(R.id.imageButton);

        imageButton.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));

    }
}
