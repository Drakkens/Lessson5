package com.drakkens.lessson5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        button1.setOnClickListener(v -> startActivity(new Intent(this, Screen1.class)));
        button2.setOnClickListener(v -> startActivity(new Intent(this, Screen2.class)));
        button3.setOnClickListener(v -> startActivity(new Intent(this, Screen3.class)));
        button4.setOnClickListener(v -> startActivity(new Intent(this, Screen4.class)));
        button5.setOnClickListener(v -> startActivity(new Intent(this, Screen5.class)));
    }
}
