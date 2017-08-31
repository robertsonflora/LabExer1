package com.example.robertson.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText q1,q2, seatWorks, labExercises, majorExam;
    Button btnCompute;
    int a,b,c,d,e;
    double rawGrade;
    String finalGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = (EditText) findViewById(R.id.q1);
        q2 = (EditText) findViewById(R.id.q2);
        seatWorks = (EditText) findViewById(R.id.seatWorks);
        labExercises = (EditText) findViewById(R.id.labExercises);
        majorExam = (EditText) findViewById(R.id.majorExam);
        btnCompute = (Button) findViewById(R.id.btnCompute);


    }

    public void callSecondActivity (View view){
        Calculate();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("rawGrade", rawGrade);
        intent.putExtra("finalGrade", finalGrade);
        startActivity(intent);
    }

        public void Calculate(){
        a = Integer.parseInt(q1.getText().toString());
        b = Integer.parseInt(q2.getText().toString());
        c = Integer.parseInt(seatWorks.getText().toString());
        d = Integer.parseInt(labExercises.getText().toString());
        e = Integer.parseInt(majorExam.getText().toString());

        rawGrade = (a * 0.10) + (b * 0.10) + (c * 0.10) + (d * 0.40) + (e * 0.30);

        if(rawGrade<60){
            finalGrade = "Failed";
        }
        else if(rawGrade > 59 && rawGrade < 66){
            finalGrade = "3.00";
        }
        else if(rawGrade > 65 && rawGrade < 75){
            finalGrade = "2.75";
        }
        else if(rawGrade > 74 && rawGrade < 80){
            finalGrade = "2.50";
        }
        else if(rawGrade > 79 && rawGrade < 85){
            finalGrade = "2.25";
        }
        else if(rawGrade > 84 && rawGrade < 90){
            finalGrade = "2.00";
        }
        else if(rawGrade > 89 && rawGrade < 92){
            finalGrade = "1.75";
        }
        else if(rawGrade > 91 && rawGrade < 94){
            finalGrade = "1.50";
        }
        else if(rawGrade > 93 && rawGrade < 100){
            finalGrade = "1.25";
        }
        else if(rawGrade == 100){
            finalGrade = "1.00";
        }
    }
}
