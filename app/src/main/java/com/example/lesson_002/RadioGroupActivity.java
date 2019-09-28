package com.example.lesson_002;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RadioGroupActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup arg0, int id) {
                switch (id) {
                    case R.id.radioButton:
                        Toast.makeText(RadioGroupActivity.this, "Chose RadioButton1!", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(RadioGroupActivity.this, "Chose RadioButton2!", Toast.LENGTH_LONG).show();
                        break;
                    default:
                        Toast.makeText(RadioGroupActivity.this, "Hoh?", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }
}
