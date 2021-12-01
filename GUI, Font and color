package com.example.myapplication;

//package com.example.experiment_1;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int[] colors = {R.style.color1, R.style.color2, R.style.color3, R.style.color4, R.style.color5, R.style.color6};
    int[] sizes = {R.style.size1, R.style.size2, R.style.size3, R.style.size4, R.style.size5, R.style.size6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void changeColor(View view) {

        Random rand = new Random();
        int style = rand.nextInt(6);

        TextView text = (TextView) findViewById(R.id.text);
        text.setTextAppearance(colors[style]);

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void changeSize(View view) {

        Random rand = new Random();
        int style = rand.nextInt(6);

        TextView text = (TextView) findViewById(R.id.text);
        text.setTextAppearance(sizes[style]);

    }

}
