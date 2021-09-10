package com.example.conveter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    EditText num_1;
    TextView textView;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button nextpage_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num_1 = findViewById(R.id.input);
        textView = findViewById(R.id.output);
        button_1 = findViewById(R.id.button1);
        button_2 = findViewById(R.id.button2);
        button_3 = findViewById(R.id.button3);
        button_4 = findViewById(R.id.button4);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double meter = Double.valueOf(num_1.getText().toString());
                double cm = meter * 100;
                textView.setText(String.valueOf(cm+" "+"cm"));
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double feet = Double.valueOf(num_1.getText().toString());
                double inch = feet * 12;
                textView.setText((String.valueOf(inch+" "+"inch")));
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double inch = Double.valueOf((num_1.getText().toString()));
                double cm = inch * 2.54;
                textView.setText(String.valueOf(cm+" "+"cm"));
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cm = Double.valueOf((num_1.getText().toString()));
                double mm = cm * 10;
                textView.setText(String.valueOf(mm+" "+"mm"));
            }
        });
    }
}