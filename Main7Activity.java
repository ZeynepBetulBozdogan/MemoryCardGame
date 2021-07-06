package com.example.zeybe.deneme;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {
    int sonKart=0;
    int score =0;
    int hata =0;
    int index =0;
    int y = 0;
    int[] w = new int[16];
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
            Intent i = getIntent();
            final String s = i.getStringExtra("mesaj");
            TextView tv = (TextView) findViewById(R.id.ısım7);
            tv.setText(s);
            GridLayout gl7 = (GridLayout) findViewById(R.id.gl7);
            Kartlar2 card[] = new Kartlar2[16];
            for (int j = 1; j <=16; j++) {
                card[j-1] = new Kartlar2(this, j);
                card[j-1].setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     final Kartlar2 k = (Kartlar2) v;
                                                     k.cevir();
                                                     if(sonKart>0) {
                                                         final Kartlar2 k2 = (Kartlar2) findViewById(sonKart);

                                                         if (k2.s == k.s && k2.getId()!=k.getId()) {
                                                             k2.cevrilebilir =false;
                                                             k.cevrilebilir =false;
                                                             for(int i = 0; i<16;i++){
                                                                 if(w[i]==k2.getId()){y++;}

                                                             }
                                                             if(y==0) {
                                                                 w[index] = k2.getId();
                                                                 index++;
                                                                 w[index] = k.getId();
                                                                 index++;
                                                                 score++;

                                                             }
                                                             y=0;
                                                             TextView tv =(TextView)findViewById(R.id.skor_7);
                                                             tv.setText("Score:"+score);

                                                             if(score == 8){
                                                                 //oyun bitti.
                                                                 TextView denem =(TextView)findViewById(R.id.denem);
                                                                 denem.setText("Başardık");
                                                                 Intent  i = new Intent(Main7Activity.this,Main3Activity.class);
                                                                 i.putExtra("puan",hata);
                                                                 i.putExtra("isim", s);
                                                                 startActivity(i);
                                                             }
                                                         }
                                                         else {
                                                             Handler h = new Handler();
                                                             h.postDelayed(new Runnable() {
                                                                 @Override
                                                                 public void run() {
                                                                     k2.cevir();
                                                                     k.cevir();
                                                                 }
                                                             },500);
                                                             if(k2.s != k.s) {
                                                                 hata++;
                                                             }
                                                             TextView tv =(TextView)findViewById(R.id.hata_7);
                                                             tv.setText("Hata Sayınız:"+ hata);
                                                             sonKart =0;
                                                         }
                                                     }
                                                     else{
                                                         sonKart = k.getId();
                                                     }
                                                 }
                                             }
                );

            }
            //swep operation
            for(int j=0;j<16;j++){
                int rg =(int)(Math.random()*16);
                Kartlar2 k = card[rg];
                card[rg] = card[j];
                card[j] =k;
            }
            for (int j = 0; j < 16; j++) {
                gl7.addView(card[j]);
            }
    }
}
