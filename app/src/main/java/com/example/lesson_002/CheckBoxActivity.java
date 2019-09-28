package com.example.lesson_002;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CheckBoxActivity extends AppCompatActivity {
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub

                if(isChecked)
                {
                    Toast.makeText(CheckBoxActivity.this, "Android Checked", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(CheckBoxActivity.this, "Android Un-Checked", Toast.LENGTH_LONG).show();
                }

            }

        });

    }
}
