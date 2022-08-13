package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =findViewById(R.id.button);
        TextView textView=findViewById(R.id.textView);
        TextView textView1=findViewById(R.id.textView2);
        EditText name=findViewById(R.id.TextView4);
        EditText age= findViewById(R.id.ageTextView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                int et2 = Integer.parseInt(age.getText().toString());
                String ne =name.getText().toString();

                intent.putExtra("item1",ne);
                intent.putExtra("item2",ne);

                startActivity(intent);




            }
        });




    }



}