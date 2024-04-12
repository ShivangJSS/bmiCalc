package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editweight,editheight;
    TextView bmiresult;
    Button calcbmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editweight=findViewById(R.id.editweight);
        editheight=findViewById(R.id.editheight);
                bmiresult=findViewById(R.id.bmiresult);
        calcbmi=findViewById(R.id.btncalcbmi);
        calcbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt=Integer.parseInt(editweight.getText().toString());
                int ht=Integer.parseInt(editheight.getText().toString());
                double bmi=wt/(ht*ht);
                if(bmi>25)
                {
                    bmiresult.setText("you are overweight");
                } else if (bmi<18) {
                    bmiresult.setText("you are underweight");
                }
                else{
                    bmiresult.setText("you are fit");
                }
            }
        });
    }
}