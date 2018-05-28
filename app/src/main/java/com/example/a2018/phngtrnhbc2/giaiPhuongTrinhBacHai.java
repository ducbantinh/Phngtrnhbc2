package com.example.a2018.phngtrnhbc2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class giaiPhuongTrinhBacHai extends AppCompatActivity{

    EditText sa,sb,sc;
    TextView da;
    Button giai,clear;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        sa = (EditText) findViewById(R.id.bon);
        sb = (EditText) findViewById(R.id.nam);
        sc = (EditText) findViewById(R.id.sau);
        da = (TextView) findViewById(R.id.tam);
        giai = (Button) findViewById(R.id.chin);
        giai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giaipt();
            }
        });
        clear = (Button)findViewById(R.id.muoi);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }
    public void clear(){
        sa.setText("");
        sb.setText("");
        sc.setText("");
        da.setText("");
    }
    public void giaipt(){
        int a = Integer.parseInt(sa.getText().toString());
        int b = Integer.parseInt(sb.getText().toString());
        int c = Integer.parseInt(sc.getText().toString());

        int denta = (b*b)+(4*a*c);
        if (a == 0 ){
            float rs = -b/c;
            da.setText("\t"+rs);
        }
        else{
            if(denta>0){
                float x1,x2;
                x1 = (float) ((-b+Math.sqrt(denta))/2*a);
                x2 = (float) ((-b-Math.sqrt(denta))/2*a);
                da.setText("\t"+"x1:"+x1+"\t"+"x2:"+x2);
            }
            else if (denta==0){
                float x;
                x = -b/2*a;
                da.setText("\t X:"+x);
            }
            else{
                da.setText("phương trình vô nghiệm");
            }
        }
    }
}
