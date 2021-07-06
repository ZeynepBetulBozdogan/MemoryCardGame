package com.example.zeybe.deneme;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.zeybe.deneme.R;

import static android.support.v7.widget.AppCompatDrawableManager.get;
public class Kartlar4 extends android.support.v7.widget.AppCompatButton {
    boolean acıkMı = false;
    boolean cevrilebilir = true;
    int arkaPlanID;
    int onPlanID = 0;
    int s = 0;
    Drawable on;
    Drawable arka;

    @SuppressLint("RestrictedApi")
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public Kartlar4(Context context, int id) {
        super(context);


        setId(id);
        arkaPlanID = R.drawable.arka;

        if (id == 1) {
            onPlanID = R.drawable.on49;
            s = 1;
        }
        if (id == 2) {
            onPlanID = R.drawable.on50;
            s = 2;
        }
        if (id == 3) {
            onPlanID = R.drawable.on51;
            s = 3;
        }
        if (id == 4) {
            onPlanID = R.drawable.on52;
            s = 4;
        }
        if (id == 5) {
            onPlanID = R.drawable.on53;
            s = 5;
        }
        if (id == 6) {
            onPlanID = R.drawable.on54;
            s = 6;
        }
        if (id == 7) {
            onPlanID = R.drawable.on55;
            s = 7;
        }
        if (id == 8) {
            onPlanID = R.drawable.on56;
            s = 8;
        }
        if (id == 9) {
            onPlanID = R.drawable.on57;
            s = 1;
        }
        if (id == 10) {
            onPlanID = R.drawable.on58;
            s = 2;
        }
        if (id == 11) {
            onPlanID = R.drawable.on59;
            s = 3;
        }
        if (id == 12) {
            onPlanID = R.drawable.on60;
            s = 4;
        }
        if (id == 13) {
            onPlanID = R.drawable.on61;
            s = 5;
        }
        if (id == 14) {
            onPlanID = R.drawable.on62;
            s = 6;
        }
        if (id == 15) {
            onPlanID = R.drawable.on63;
            s = 7;
        }
        if (id == 16) {
            onPlanID = R.drawable.on64;
            s = 8;
        }
        arka = get().getDrawable(context, arkaPlanID);
        on = get().getDrawable(context, onPlanID);
        setBackground(arka);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void cevir() {
        if (cevrilebilir) {
            if (!acıkMı) {
                setBackground(on);
                acıkMı = true;
            } else {
                setBackground(arka);
                acıkMı = false;
            }
        }
    }


}
