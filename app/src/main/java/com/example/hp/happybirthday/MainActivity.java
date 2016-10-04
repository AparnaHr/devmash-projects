package com.example.hp.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View Button;
    String input;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = findViewById(R.id.button);
        text = (TextView) findViewById(R.id.one);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input="HAPPY BIRTHDAY";
                text.setText(input);
            }
        });
    }
}

