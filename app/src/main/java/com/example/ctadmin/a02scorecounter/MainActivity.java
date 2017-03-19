package com.example.ctadmin.a02scorecounter;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btnreset;
    int A=0;int B=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.b1);
        btn1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View vw) {
                A= A+1;
                TextView scoreView = (TextView) findViewById(R.id.AScore);
                scoreView.setText(String.valueOf(A));

            }
        });
        btn2=(Button)findViewById(R.id.b2);
        btn2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View vw) {
                B= B+1;
                TextView scoreView = (TextView) findViewById(R.id.BScore);
                scoreView.setText(String.valueOf(B));

            }
        });
        btn3=(Button)findViewById(R.id.b3);
        btn3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View vw) {
                A= A+2;
                TextView scoreView = (TextView) findViewById(R.id.AScore);
                scoreView.setText(String.valueOf(A));

            }
        });
        btn4=(Button)findViewById(R.id.b4);
        btn4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View vw) {
                B= B+2;
                TextView scoreView = (TextView) findViewById(R.id.BScore);
                scoreView.setText(String.valueOf(B));

            }
        });
        btn5=(Button)findViewById(R.id.b5);
        btn5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View vw) {
                A= A+3;
                TextView scoreView = (TextView) findViewById(R.id.AScore);
                scoreView.setText(String.valueOf(A));

            }
        });
        btn6=(Button)findViewById(R.id.b6);
        btn6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View vw) {
                B= B+3;
                TextView scoreView = (TextView) findViewById(R.id.BScore);
                scoreView.setText(String.valueOf(B));

            }
        });
        btnreset=(Button)findViewById(R.id.reset);
        btnreset.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View vw) {
                B=0;A=0;
                TextView scoreView = (TextView) findViewById(R.id.AScore);
                scoreView.setText(String.valueOf(A));
                TextView scoreView1 = (TextView) findViewById(R.id.BScore);
                scoreView1.setText(String.valueOf(B));

            }
        });






    }
}
