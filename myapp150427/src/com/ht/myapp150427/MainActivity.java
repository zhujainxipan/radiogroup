package com.ht.myapp150427;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        RadioButton radioButton01 = (RadioButton) findViewById(R.id.rabt01);
        RadioButton radioButton02 = (RadioButton) findViewById(R.id.rabt02);
        RadioButton radioButton03 = (RadioButton) findViewById(R.id.rabt03);
        RadioButton radioButton04 = (RadioButton) findViewById(R.id.rabt04);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkID) {
                switch (checkID) {
                    case R.id.rabt01:
                        radioButton01.setTextColor(Color.rgb(220, 20, 60));
                        radioButton02.setTextColor(Color.rgb(0, 0, 0));
                        radioButton03.setTextColor(Color.rgb(0, 0, 0));
                        radioButton04.setTextColor(Color.rgb(0, 0, 0));
                        break;
                    case R.id.rabt02:
                        radioButton02.setTextColor(Color.rgb(220, 20, 60));
                        radioButton01.setTextColor(Color.rgb(0, 0, 0));
                        radioButton03.setTextColor(Color.rgb(0, 0, 0));
                        radioButton04.setTextColor(Color.rgb(0, 0, 0));
                        break;
                    case R.id.rabt03:
                        radioButton03.setTextColor(Color.rgb(220, 20, 60));
                        radioButton01.setTextColor(Color.rgb(0, 0, 0));
                        radioButton02.setTextColor(Color.rgb(0, 0, 0));
                        radioButton04.setTextColor(Color.rgb(0, 0, 0));
                        break;
                    case R.id.rabt04:
                        radioButton04.setTextColor(Color.rgb(220, 20, 60));
                        radioButton01.setTextColor(Color.rgb(0, 0, 0));
                        radioButton02.setTextColor(Color.rgb(0, 0, 0));
                        radioButton03.setTextColor(Color.rgb(0, 0, 0));
                        break;
                }


            }
        });

    }
}
