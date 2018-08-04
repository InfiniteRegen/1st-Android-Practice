package com.example.a2normous_rollback.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool);

        init();
        btn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random dice = new Random();
                int result = dice.nextInt(6) + 1;

                tv_result.setText(String.valueOf(result));
            }
        });
    }

    public void init() {
        tv_result = (TextView) findViewById(R.id.tv_result);
        btn_button = (Button) findViewById(R.id.btn_roll);
    }
}
