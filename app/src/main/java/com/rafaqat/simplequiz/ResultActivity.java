package com.rafaqat.simplequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        int score=getIntent().getIntExtra("Score",0);
        int wrong=getIntent().getIntExtra("Wrong",0);
        int correct=getIntent().getIntExtra("Correct",0);


        TextView txtscore=findViewById(R.id.textView_total);
        TextView txtwrong=findViewById(R.id.textView_wrong);
        TextView txtcorrect=findViewById(R.id.textView_correct);


        txtscore.setText(txtscore.getText()+" "+score);
        txtwrong.setText(txtwrong.getText()+" "+wrong);
        txtcorrect.setText(txtcorrect.getText()+" "+correct);

        Button btnrestart=findViewById(R.id.button_restart);
        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}