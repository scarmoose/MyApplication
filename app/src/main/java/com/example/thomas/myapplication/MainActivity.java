package com.example.thomas.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button b1;
    TextView v1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.button1);
        b1.setText("Sig hej!");
        v1 = (TextView) findViewById(R.id.text1);
        v1.setText("Tryk på knappen!");
        e1 = (EditText) findViewById(R.id.edit1);
        e1.setText("Skriv dit navn!");

        b1.setOnClickListener(this);
        v1.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == b1) v1.setText("Hej "+e1.getText());
        if (v == v1) v1.setText("Text 1 is trykked");
    }

}
