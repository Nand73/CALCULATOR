package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
//import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,mod,brc1,brc2,log1,tag1
            ,tag2,tag3,tag4,tag5,tag6,tag7,tag8;
    TextView tvInput,tvOutput;
    String process;
    String pi="3.14159";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn10=findViewById(R.id.btn10);
        btn11=findViewById(R.id.btn11);
        btn12=findViewById(R.id.btn12);
        btn13=findViewById(R.id.btn13);
        btn14=findViewById(R.id.btn14);
        btn15=findViewById(R.id.btn15);
        btn16=findViewById(R.id.btn16);
        btn17=findViewById(R.id.btn17);
        tvInput=findViewById(R.id.tvInput);
        tvOutput=findViewById(R.id.tvOutput);
        mod=findViewById(R.id.mod);
        brc1=findViewById(R.id.brc1);
        brc2=findViewById(R.id.brc2);
        log1=findViewById(R.id.log1);
        tag1=findViewById(R.id.tag1);
        tag2=findViewById(R.id.tag2);
        tag3=findViewById(R.id.tag3);
        tag4=findViewById(R.id.tag4);
        tag5=findViewById(R.id.tag5);
        tag6=findViewById(R.id.tag6);
        tag7=findViewById(R.id.tag7);
        tag8=findViewById(R.id.tag8);


        RelativeLayout normalCalculatorLayout=findViewById(R.id.normalCalLayout);
        RelativeLayout scientificCalculatorLayout=findViewById(R.id.scientificCalLayout);

        SwitchCompat switchBTN=findViewById(R.id.switchBtn);

        switchBTN.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                scientificCalculatorLayout.setVisibility(View.VISIBLE);
                normalCalculatorLayout.setVisibility(View.GONE);
            }else {
                scientificCalculatorLayout.setVisibility(View.GONE);
                normalCalculatorLayout.setVisibility(View.VISIBLE);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
            }

        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 process=tvInput.getText().toString();
                 tvInput.setText(process+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"+");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"4");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"5");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"6");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"-");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"7");
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"8");
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"9");
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"x");
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+".");
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"0");
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            process=tvInput.getText().toString();
            tvInput.setText(process+"÷");
        }
    });
        brc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              tvInput.setText(tvInput.getText()+"(");
            }
        });
        brc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tvInput.setText(tvInput.getText()+")");
            }
        });
        log1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                double r=Math.log(Double.parseDouble(process));
                tvInput.setText(String.valueOf(r));

            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"%");
            }
        });
        tag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //  tvOutput.setText(tag7.getText());
               tvInput.setText(tvInput.getText()+"tan");
            }
        });
        tag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // tvOutput.setText(tag7.getText());
               tvInput.setText(tvInput.getText()+"cos");
            }
        });
        tag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               tvInput.setText(tvInput.getText()+"sin");
            }
        });
        tag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvInput.setText(process+"ln");
            }
        });
        tag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
              double r=Math.sqrt(Double.parseDouble(process));
              tvInput.setText(String.valueOf(r));
            }
        });
        tag6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int val=Integer.parseInt(tvInput.getText().toString());
              int fact=factorial(val);
              tvOutput.setText(String.valueOf(fact));
              tvInput.setText(val+"!");
            }
        });
        tag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tvOutput.setText(btn7.getText());
               tvInput.setText(tvInput.getText()+pi);
            }
        });
        tag8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double d=Double.parseDouble(tvInput.getText().toString());
                Double square=d*d;
                tvOutput.setText(String.valueOf(square));
                tvInput.setText(d+"²");
            }
        });


       btn15.setOnClickListener(new View.OnClickListener() {
          @Override
        public void onClick(View v) {
              process=tvInput.getText().toString();
                process=process.replace("x","*");
                process=process.replace("%","1/100");
               process=process.replace("÷","/");

                Context rhino = Context.enter();
              rhino.setOptimizationLevel(-1);
        String finalresult="";
                try {

                    Scriptable scriptable = rhino.initSafeStandardObjects();
                    finalresult=rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
                }catch (Exception e){
                    finalresult="0";
                }
               tvOutput.setText(finalresult);


                }

      });




    }
    //factorial
    int factorial(int n){
        return (n==1||n==0) ? 1: n*factorial(n-1 );
    }

 //eval function

    }
