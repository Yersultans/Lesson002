package com.example.lesson_002;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import static com.example.lesson_002.ElementsBuilder.BUTTON_ID;
import static com.example.lesson_002.ElementsBuilder.CHECK_BOX_ID;
import static com.example.lesson_002.ElementsBuilder.EDIT_TEXT_ID;
import static com.example.lesson_002.ElementsBuilder.IMAGE_VIEW_ID;
import static com.example.lesson_002.ElementsBuilder.PROGRESS_BAR_ID;
import static com.example.lesson_002.ElementsBuilder.RADIO_GROUP_ID;
import static com.example.lesson_002.ElementsBuilder.RATING_BAR_ID;
import static com.example.lesson_002.ElementsBuilder.SWITCH_ID;
import static com.example.lesson_002.ElementsBuilder.TEXT_VIEW_ID;
import static com.example.lesson_002.ElementsBuilder.buildElements;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        MainAdapter mainAdapter = new MainAdapter(buildElements(), new MainClickListener() {
            @Override
            public void onClick(Element element) {
                switch (element.getId()) {
                    case BUTTON_ID:
                        /*
                         * todo Add Button with on ClickListener
                         * */
                        startActivity(new Intent(MainActivity.this, ButtonActivity.class));
                        break;
                    case TEXT_VIEW_ID:
                        /*
                         * todo Add TextView, customize its color, size, style
                         * */
                        startActivity(new Intent(MainActivity.this, TextViewActivity.class));
                        break;
                    case EDIT_TEXT_ID:
                        /*
                         * todo Add EditText with TextWatcher
                         * */
                        startActivity(new Intent(MainActivity.this, EditTextActivity.class));
                        break;
                    case CHECK_BOX_ID:
                        /*
                         * todo Add CheckBox with CheckedChangeListener
                         * */
                        startActivity(new Intent(MainActivity.this, CheckBoxActivity.class));
                        break;
                    case RADIO_GROUP_ID:
                        /*
                         * todo Add RadioGroup with RadioButtons and CheckedChangeListener
                         * */
                        startActivity(new Intent(MainActivity.this, RadioGroupActivity.class));
                        break;
                    case SWITCH_ID:
                        /*
                         * todo Add Switch with CheckedChangeListener
                         * */
                        startActivity(new Intent(MainActivity.this, SwitchActivity.class));
                        break;
                    case IMAGE_VIEW_ID:
                        /*
                             * todo Add several ImageViews, use several scaleTypes
                         * Load images from res/drawable project folder
                         * */
                        startActivity(new Intent(MainActivity.this, ImageViewActivity.class));
                        break;
                    case PROGRESS_BAR_ID:
                        /*
                         * todo Add ProgressBar with onScrollChangedListener
                         * */
                        startActivity(new Intent(MainActivity.this, ProgressBarActivity.class));
                        break;
                    case RATING_BAR_ID:
                        /*
                         * todo Add RatingBar with onRatingBarChangeListener
                         * */
                        startActivity(new Intent(MainActivity.this, RatingBarActivity.class));
                        break;
                    default:
                        Toast.makeText(MainActivity.this, element.getName(), Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mainAdapter);
    }
}