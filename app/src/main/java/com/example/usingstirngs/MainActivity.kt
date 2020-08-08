package com.example.usingstirngs

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import kotlinx.android.synthetic.main.activity_main.*


public class MainActivity : AppCompatActivity() {

    TextView textView2;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Activity_main);

        textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);
    }
        
    }

}