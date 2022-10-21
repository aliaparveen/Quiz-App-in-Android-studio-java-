package com.rafaqat.simplequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q5 extends AppCompatActivity {

    boolean status=false;

    int score;
    int correct;
    int wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);


        score=getIntent().getIntExtra("Score",0);
        wrong=getIntent().getIntExtra("Wrong",0);
        correct=getIntent().getIntExtra("Correct",0);



        Button op1=findViewById(R.id.opt_a);
        Button op2=findViewById(R.id.opt_b);
        Button op3=findViewById(R.id.opt_c);
        Button op4=findViewById(R.id.opt_d);

        Button next=findViewById(R.id.btn_next);


        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op2.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                op3.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                op4.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);

                op1.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_baseline_done_24,0);
                status=false;
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                op3.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                op4.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);

                op2.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_baseline_done_24,0);
                status=false;
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                op2.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                op4.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);

                op3.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_baseline_done_24,0);
                status=true;
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                op2.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);
                op3.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0);

                op4.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,R.drawable.ic_baseline_done_24,0);
                status=false;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(status){
                    score=score+2;
                    correct=correct+1;
                }else{
                    wrong=wrong+1;
                }

                Intent intent=new Intent(Q5.this,ResultActivity.class);
                intent.putExtra("Score",score);
                intent.putExtra("Wrong",wrong);
                intent.putExtra("Correct",correct);

                startActivity(intent);

            }
        });
    }
}