package com.example.experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView13);
        Button buttonColor = findViewById(R.id.button);
        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("" , "inside click");
//                if(buttonColor.getCurrentTextColor() == Color.BLACK){
//                    buttonColor.setTextColor(Color.WHITE);
//                    return;
//                }
//                buttonColor.setTextColor(Color.BLACK);
                textView.setText("On click is pressed");
                textView.setTextColor(Color.GREEN);
            }
        });

        Button buttonLong = findViewById(R.id.button2);
        buttonLong.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Log.d("" , "inside long click");

                textView.setText("On Long Click is pressed");
                textView.setTextColor(Color.BLUE);
//                relativeLayout.setBackgroundResource(android.R.color.holo_blue_light);
                return false;
            }
        });
        Button buttonLong1 = findViewById(R.id.button5);
        buttonLong1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Log.d("" , "inside long click");

                textView.setText("On Long Click is pressed");
                textView.setTextColor(Color.BLUE);
//                relativeLayout.setBackgroundResource(android.R.color.holo_blue_light);
                return false;
            }
        });

        Button buttonKey = findViewById(R.id.button3);
        buttonKey.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent event) {
                buttonKey.setVisibility(View.INVISIBLE);
                if (event.getAction() == KeyEvent.ACTION_UP) {
                    textView.setText("Key is pressed");
                    textView.setTextColor(Color.BLACK);
//                relativeLayout.setBackgroundResource(android.R.color.holo_blue_dark);
                    return true;
                }
                return false;
            }

        });
        buttonLong.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                textView.setText("On Touch is pressed");
                return false;
            }
        });
    }
}
