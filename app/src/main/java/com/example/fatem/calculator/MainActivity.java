package com.example.fatem.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button svn, eit, nin, mul, div, fr, fv, sx, ad, min, on, tw, thr, zr, eql, clr;

    TextView display;

    Double mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision, mEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        on = findViewById(R.id.on);
        tw = findViewById(R.id.tw);
        thr = findViewById(R.id.thr);
        fr = findViewById(R.id.fr);
        fv = findViewById(R.id.fv);
        sx = findViewById(R.id.sx);
        svn = findViewById(R.id.svn);
        eit = findViewById(R.id.eit);
        nin = findViewById(R.id.nin);
        zr = findViewById(R.id.zr);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        ad = findViewById(R.id.ad);
        min = findViewById(R.id.min);
        eql = findViewById(R.id.eql);
        display = findViewById(R.id.dis);
        clr = findViewById(R.id.clr);


        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "1");
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "2");
            }
        });

        thr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "3");
            }
        });

        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "4");
            }
        });

        fv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "5");
            }
        });

        sx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "6");
            }
        });

        svn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "7");
            }
        });

        eit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "8");
            }
        });

        nin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    display.setText(display.getText() + "9");
            }
        });

        zr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "0");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Double.parseDouble(display.getText() + "");
                mMultiplication = true;
                display.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Double.parseDouble(display.getText() + "");
                mDivision = true;
                display.setText(null);
            }
        });

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    mValueOne = Double.parseDouble(display.getText() + "");
                    mAddition = true;
                    display.setText(null);
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Double.parseDouble(display.getText() + "");
                mSubtract = true;
                display.setText(null);
            }
        });

        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEqual=true;
                mValueTwo = Double.parseDouble(display.getText() + "");

                if (mMultiplication == true) {

                   display.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    display.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }

                if (mAddition == true) {
                    display.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if (mSubtract == true) {
                    display.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }
                mEqual=false;
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearData();
            }
        });
    }

    public void clearData(){
        display.setText("");
    }


}
