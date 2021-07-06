package com.example.zeybe.deneme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent i = getIntent();
          final TextView tv = (TextView)findViewById(R.id.isım_4);
        final String s = i.getStringExtra("mesaj");
          tv.setText(s);
        ((Button)findViewById(R.id.trigo)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Main4Activity.this,Main2Activity.class);
                i.putExtra("mesaj",tv.getText().toString());
                startActivity(i);
            }
        });
        ((Button)findViewById(R.id.derivative)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Main4Activity.this,Main5Activity.class);
                i.putExtra("mesaj",tv.getText().toString());
                startActivity(i);
            }
        });
        ((Button)findViewById(R.id.ıntegral)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Main4Activity.this,Main6Activity.class);
                i.putExtra("mesaj",tv.getText().toString());
                startActivity(i);
            }
        });
        ((Button)findViewById(R.id.halfangle)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Main4Activity.this,Main7Activity.class);
                i.putExtra("mesaj",tv.getText().toString());
                startActivity(i);
            }
        });
    }
}
