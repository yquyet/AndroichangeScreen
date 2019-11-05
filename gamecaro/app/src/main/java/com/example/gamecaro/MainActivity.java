package com.example.gamecaro;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    Button btn,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count %2 == 0){
                    btn.setText("X");
                }else {
                    btn.setText("O");
                }
                checkwin();
            }
        });

        btn1 = findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count %2 == 0){
                    btn1.setText("X");
                }else {
                    btn1.setText("O");
                }
                checkwin();
            }
        });

        btn2 = findViewById(R.id.btn3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count %2 == 0){
                    btn2.setText("X");
                }else {
                    btn2.setText("O");
                }
                checkwin();
            }
        });

        btn3 = findViewById(R.id.btn4);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count %2 == 0){
                    btn3.setText("X");
                }else {
                    btn3.setText("O");
                }
            }
        });
        btn4 = findViewById(R.id.btn5);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count %2 == 0){
                    btn4.setText("X");
                }else {
                    btn4.setText("O");
                }
            }
        });
        btn5 = findViewById(R.id.btn6);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count %2 == 0){
                    btn5.setText("X");
                }else {
                    btn5.setText("O");
                }
            }
        });
        btn6 = findViewById(R.id.btn7);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count %2 == 0){
                    btn6.setText("X");
                }else {
                    btn6.setText("O");
                }
            }
        });
        btn7 = findViewById(R.id.btn8);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count %2 == 0){
                    btn7.setText("X");
                }else {
                    btn7.setText("O");
                }
            }
        });

        btn8 = findViewById(R.id.btn9);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                if (count %2 == 0){
                    btn8.setText("X");
                }else {
                    btn8.setText("O");
                }
            }
        });
    }

    public void checkwin(){
        String textB = btn.getText().toString();
        String textB1 = btn1.getText().toString();
        String textB2 = btn2.getText().toString();
        String textB3 = btn3.getText().toString();
        String textB4 = btn4.getText().toString();
        String textB5 = btn5.getText().toString();
        String textB6 = btn6.getText().toString();
        String textB7 = btn7.getText().toString();
        String textB8 = btn8.getText().toString();


        if (textB.equals(textB1)&& textB.equals(textB2) ){
            //AlertDialog.Builder mess=new

            Toast toast = Toast.makeText(MainActivity.this, "Bạn đã thắng",Toast.LENGTH_SHORT);
            toast.show();
            btn.setText("");
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
        }
    }

}
