package ru.kovtunenko.kovtunenko_v_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE); // << это вставить именно сюда
        setContentView(R.layout.start);

        Button btn = (Button) findViewById(R.id.button_8);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(this, SecondActivity.class);
            startActivity(i);
        })
        ;
    }
}