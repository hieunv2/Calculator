package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnMul,btnEql,btnDiv,btnC,btnBs,btnCe;

    TextView mainText,viewText;

    float tmp ,result;


    boolean isAdd,isSub,isMul,isDiv;
    char lastC;


    public void xuly(String myText) {
        result = 0;
        int len = myText.length();
        String text1 = "";
        for(int i=0;i<len;i++){
            char t = myText.charAt(i);
            if(t == '+' && text1 != "") {
                lastC='+';
                result += Float.parseFloat(text1);
                text1 = "";
                tmp =0;
            }
            if(t=='-' && text1!= "") {
                lastC='-';
                result -= Float.parseFloat(text1);
                text1 = "";
            }
            if(t=='/' && text1 != "" && Float.parseFloat(text1) != 0){
                lastC='*';
                result = (float) result/(Float.parseFloat(text1));
                text1 = "";
                tmp = 0;
            }
            if(t == '*' && text1 != "") {
                lastC='/';
                result*=Float.parseFloat(text1);
                text1 = "";
                tmp = 0;
            }
            if(t != '*' && t!= '/' && t != '+' && t!= '-') {
                text1 += String.valueOf(t);
                tmp = Float.parseFloat(text1);
            }
        }
        result = (int) result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAdd = (Button) findViewById(R.id.btnadd);
        btnSub = (Button) findViewById(R.id.btnsub);
        btnMul = (Button) findViewById(R.id.btnmul);
        btnDiv = (Button) findViewById(R.id.btndiv);
        btnC = (Button) findViewById(R.id.btnc);
        btnCe = (Button) findViewById(R.id.btnce);
        btnBs = (Button) findViewById(R.id.btnbs);
        btnEql = (Button) findViewById(R.id.btneql);

        mainText = (TextView) findViewById(R.id.text1);
        viewText = (TextView) findViewById(R.id.text2);

        btnCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mainText.setText(null);
               viewText.setText("");
               result = 0;
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp =(String) mainText.getText();
                char c = temp.charAt(temp.length()-1);
                    temp = temp.substring(0,temp.length() -1);
                    mainText.setText(temp);
            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "0");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "1");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "2");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "3");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "4");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "5");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "6");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "7");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "8");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText(mainText.getText() + "9");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp =(String) mainText.getText();
                char c = temp.charAt(temp.length()-1);
                if(c == '+' || c == '-' || c == '*' || c == '/') {
                    temp = temp.substring(0,temp.length() -1);
                    mainText.setText(temp);
                }
                mainText.setText(mainText.getText() + "+");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp =(String) mainText.getText();
                char c = temp.charAt(temp.length()-1);
                if(c == '+' || c == '-' || c == '*' || c == '/') {
                    temp = temp.substring(0,temp.length() -1);
                    mainText.setText(temp);
                }
                mainText.setText(mainText.getText() + "-");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp =(String) mainText.getText();
                char c = temp.charAt(temp.length()-1);
                if(c == '+' || c == '-' || c == '*' || c == '/') {
                    temp = temp.substring(0,temp.length() -1);
                    mainText.setText(temp);
                }
                mainText.setText(mainText.getText() + "*");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp =(String) mainText.getText();
                char c = temp.charAt(temp.length()-1);
                if(c == '+' || c == '-' || c == '*' || c == '/') {
                    temp = temp.substring(0,temp.length() -1);
                    mainText.setText(temp);
                }
                mainText.setText(mainText.getText() + "/");
                xuly((String)mainText.getText());
                viewText.setText(result+"");
            }
        });
        btnEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp =(String) mainText.getText();
                char c = temp.charAt(temp.length()-1);
                if(c == '+' || c == '-' || c == '*' || c == '/') {
                    temp = temp.substring(0,temp.length() -1);
                    mainText.setText(temp);
                }
                if(lastC == '+') {
                    result += tmp;
                }
                if(lastC == '-') {
                    result -= tmp;
                }
                if(lastC == '*') {
                    result *= tmp;
                }
                if(lastC == '/') {
                    result /= tmp;
                }
                viewText.setText(result+"");
            }
        });


    }
}
