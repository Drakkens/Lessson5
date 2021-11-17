package com.drakkens.lessson5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class Screen3 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen3);


        EditText editText = findViewById(R.id.editTextTextPersonName);
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> editText.setEnabled(isChecked));

    }
}
