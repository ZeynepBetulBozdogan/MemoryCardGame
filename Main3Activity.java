package com.example.zeybe.deneme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv = (TextView) findViewById(R.id.son);
        Intent i = getIntent();
        int skor = i.getIntExtra("puan", 0);
        String isim = i.getStringExtra("isim");

        tv.setText("Tebrikler " + isim + " \n" + skor + " hata ile kazandınız.");



        ((Button) findViewById(R.id.comeback)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
