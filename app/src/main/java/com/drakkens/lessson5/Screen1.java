package com.drakkens.lessson5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Screen1 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);

    }

    public void backToMain(View button) {
        button.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
    }

}
