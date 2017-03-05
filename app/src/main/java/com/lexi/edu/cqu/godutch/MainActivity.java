package com.lexi.edu.cqu.godutch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String Price;
    private String NbrPeo;
    EditText price;
    EditText nbrpeo;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        price = (EditText) findViewById(R.id.edittext1);
        nbrpeo=(EditText)findViewById(R.id.edittext2);
        textView=(TextView)findViewById(R.id.textView4);
    }
    protected void godutch(View v)
    {

        double P=Double.parseDouble(price.getText().toString());
        double N=Double.parseDouble(nbrpeo.getText().toString());
        double S=P/N;
        textView.setText(String.valueOf("Each person :"+S));
        Toast.makeText(getBaseContext(),"Each person :"+S,Toast.LENGTH_SHORT).show();

    }
}
