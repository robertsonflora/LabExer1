package com.example.robertson.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btn_Back;
    TextView ra, fg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ra = (TextView)findViewById(R.id.ra);
        fg = (TextView)findViewById(R.id.fg);
        btn_Back = (Button) findViewById(R.id.btnBack);

        String finalGrade = getIntent().getStringExtra("finalGrade");
        double rawGrade = getIntent().getDoubleExtra("rawGrade",0);
        String grade = Double.toString(rawGrade);
        ra.setText(grade);
        fg.setText(finalGrade);
    }

    public void goBackToMain(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}
