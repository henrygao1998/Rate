package com.henry.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView out;
    EditText inp;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        out = findViewById(R.id.answer);
        inp = findViewById(R.id.inp);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double a = Double.parseDouble(inp.getText().toString());
        double b = (9.0*a)/5.0+32.0;
        out.setText("华氏度为"+String.valueOf(b)+"℉");
    }

}



