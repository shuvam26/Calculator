package com.example.laptop.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    int op = 0;
    int n1 =0,n2=0,n=0,p=0,a=0,b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        //setBackgroundColor(Color.WHITE);

        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 0;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 0;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 1;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 1;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 2;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 2;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 3;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 3;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 4;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 4;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 5;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 5;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 6;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 6;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 7;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 7;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 8;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 8;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        if(count >= 0 && op == 0)
                        {
                            n1 = 9;
                            n += n1*pow(10,count);
                            textView.append(Integer.toString(n1));
                            count++;
                        }
                        if(op!=0)
                        {
                            n2 = 9;
                            p += n2*pow(10,count);
                            textView.append(Integer.toString(n2));
                            count++;
                        }

                    }
                }
        );

            Button buttonmul = (Button) findViewById(R.id.buttonmul);
            buttonmul.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick (View v){
                            if(count!=0){
                                TextView textView = (TextView) findViewById(R.id.textView);
                                textView.append(" X ");
                                op = 1;
                                count=0;
                            }
                        }
                    }
            );

            Button buttonsub = (Button) findViewById(R.id.buttonsub);
            buttonsub.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick (View v){
                            if(count!=0) {
                                TextView textView = (TextView) findViewById(R.id.textView);
                                textView.append(" - ");
                                op = 2;
                                count=0;
                            }
                        }
                    }
            );

            Button buttonsum = (Button) findViewById(R.id.buttonsum);
            buttonsum.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick (View v){
                            if(count!=0) {
                                TextView textView = (TextView) findViewById(R.id.textView);
                                textView.append(" + ");
                                op = 3;
                                count=0;
                            }
                        }
                    }
            );

            Button buttondiv = (Button) findViewById(R.id.buttondiv);
            buttondiv.setOnClickListener(
                    new Button.OnClickListener(){
                        public void onClick (View v){
                            if(count!=0) {
                                TextView textView = (TextView) findViewById(R.id.textView);
                                textView.append(" / ");
                                op = 4;
                                count=0;
                            }
                        }
                    }
            );


        Button buttoneq = (Button) findViewById(R.id.buttoneq);
        buttoneq.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){


                        TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("");
                        while(n!=0)
                        {
                            a = a*10 + n%10;
                            n=n/10;
                        }
                        while(p!=0)
                        {
                            b = b*10 + p%10;
                            p=p/10;
                        }
                        if(op==0)
                        {
                            textView.setText(Integer.toString(a));
                        }
                        else if(op==1)
                        {
                            int s = a*b;
                            textView.setText(Integer.toString(s));
                        }
                        else if(op==2)
                        {
                            int s = a-b;
                            textView.setText(Integer.toString(s));
                        }
                        else if(op==3)
                        {
                            int s = a+b;
                            textView.setText(Integer.toString(s));
                        }
                        else if(op==4)
                        {
                            if(n2==0)
                            {
                                textView.setText("Infinity");
                            }
                            else
                            {
                                float s = (float)a / (float)b;
                                textView.setText(Float.toString(s));
                            }
                            }
                    }
                }
        );

        Button buttonac = (Button) findViewById(R.id.buttonac);
        buttonac.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick (View v){
                        TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("");
                        count = 0;
                        n=0;
                        n1=0;
                        n2=0;
                        op=0;
                        n=0;
                        p=0;
                        a=0;
                        b=0;
                    }
                }
        );

    }
}
