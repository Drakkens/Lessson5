package com.drakkens.lessson5;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;

public class Screen5 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen5);

        RadioGroup orientation = findViewById(R.id.orientation);
        RadioGroup gravity = findViewById(R.id.gravity);

        orientation.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case R.id.Horizontal:
                    orientation.setOrientation(LinearLayout.HORIZONTAL);
                    break;

                case R.id.Vertical:
                    orientation.setOrientation(LinearLayout.VERTICAL);
                    break;
            }
        });

        gravity.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case R.id.Left:
                    for (int i = 0; i < gravity.getChildCount(); i++) {
                        ((RadioButton) gravity.getChildAt(i)).setGravity(Gravity.LEFT);
                    }
                    break;

                case R.id.Center:
                    for (int i = 0; i < gravity.getChildCount(); i++) {
                        ((RadioButton) gravity.getChildAt(i)).setGravity(Gravity.CENTER_HORIZONTAL);
                    }
                    break;

                case R.id.Right:
                    for (int i = 0; i < gravity.getChildCount(); i++) {
                        ((RadioButton) gravity.getChildAt(i)).setGravity(Gravity.RIGHT);
                    }
                    break;
            }
        });


    }
}
