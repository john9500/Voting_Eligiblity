package com.example.voting_eligiblity;
//Author : John Sathya Seelan

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4;
    EditText edi1,edi2,edi3;
    Button btn1;
    private  int input1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.onetext);
        txt2 = findViewById(R.id.secondtext);
        txt3 = findViewById(R.id.thirdtext);
        txt4 = findViewById(R.id.fourthtext);
        edi1 = findViewById(R.id.name);
        edi2 = findViewById(R.id.age);
        edi3 = findViewById(R.id.gender);
        btn1 = findViewById(R.id.check);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= edi1.getText().toString();
                String s4= edi3.getText().toString();
                input1 = Integer.parseInt(edi2.getText().toString());
                if(input1>=  18){
                    txt1.setText("Name : " + s1);
                    txt2.setText("Age : " + Integer.toString(input1));
                    txt3.setText("Gender : "+ s4);
                    txt4.setText("Eligible to Vote");
                }
                else if(input1<=18)
                {
                    txt1.setText("Name : " +s1);
                    txt2.setText("Age : " + Integer.toString(input1));
                    txt3.setText("Gender : "+s4);
                    txt4.setText("Not Eligible to Vote");
                }
            }
        });



    }
}