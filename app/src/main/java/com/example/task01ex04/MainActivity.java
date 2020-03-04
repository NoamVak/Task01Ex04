package com.example.task01ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
    }
    int num=0;
    public void Click(View view) {
        num++;
        btn.setText("This is a click number:"+num);
        if (num%7==0){
            btn.setText("BOOM!");
        }
    }
}
