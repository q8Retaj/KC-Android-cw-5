package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView=findViewById(R.id.textView3);
        TextView textView1=findViewById(R.id.textView9);
        TextView textView2=findViewById(R.id.TextView4);
        TextView textView3=findViewById(R.id.textView5);
        TextView textView4=findViewById(R.id.ageTextView);
        TextView textView5=findViewById(R.id.textView7);
        Bundle bundle=getIntent().getExtras();
        String n=bundle.getString("item1");
        textView3.setText(n);
        int a=bundle.getInt("item2");
        textView4.setText(String.valueOf(a));
    }
}