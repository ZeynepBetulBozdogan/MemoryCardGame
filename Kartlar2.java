package com.example.zeybe.deneme;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.zeybe.deneme.R;

import static android.support.v7.widget.AppCompatDrawableManager.get;

public class Kartlar2 extends android.support.v7.widget.AppCompatButton {
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
    public Kartlar2(Context context, int id) {
        super(context);


        setId(id);
        arkaPlanID = R.drawable.arka;

        if (id == 1) {
            onPlanID = R.drawable.on17;
            s = 1;
        }
        if (id == 2) {
            onPlanID = R.drawable.on18;
            s = 2;
        }
        if (id == 3) {
            onPlanID = R.drawable.on19;
            s = 3;
        }
        if (id == 4) {
            onPlanID = R.drawable.on20;
            s = 4;
        }
        if (id == 5) {
            onPlanID = R.drawable.on21;
            s = 5;
        }
        if (id == 6) {
            onPlanID = R.drawable.on22;
            s = 6;
        }
        if (id == 7) {
            onPlanID = R.drawable.on23;
            s = 7;
        }
        if (id == 8) {
            onPlanID = R.drawable.on24;
            s = 8;
        }
        if (id == 9) {
            onPlanID = R.drawable.on25;
            s = 1;
        }
        if (id == 10) {
            onPlanID = R.drawable.on26;
            s = 2;
        }
        if (id == 11) {
            onPlanID = R.drawable.on27;
            s = 3;
        }
        if (id == 12) {
            onPlanID = R.drawable.on28;
            s = 4;
        }
        if (id == 13) {
            onPlanID = R.drawable.on29;
            s = 5;
        }
        if (id == 14) {
            onPlanID = R.drawable.on30;
            s = 6;
        }
        if (id == 15) {
            onPlanID = R.drawable.on31;
            s = 7;
        }
        if (id == 16) {
            onPlanID = R.drawable.on32;
            s = 8;
        }
        /*if(id ==17) {
            onPlanID = R.drawable.on17;
            s=9;
        }
        if(id ==18) {
            onPlanID = R.drawable.on18;
            s=10;
        }
        if(id ==19) {
            onPlanID = R.drawable.on19;
            s=11;
        }
        if(id ==20) {
            onPlanID = R.drawable.on20;
            s=12;
        }
        if(id ==21) {
            onPlanID = R.drawable.on21;
            s=13;
        }
        if(id ==22) {
            onPlanID = R.drawable.on22;
            s=14;
        }
        if(id ==23) {
            onPlanID = R.drawable.on23;
            s=15;
        }
        if(id ==24) {
            onPlanID = R.drawable.on24;
            s=16;
        }
        if(id ==25){
            onPlanID = R.drawable.on25;
            s=9;
        }
        if(id == 26){
            onPlanID = R.drawable.on26;
            s=10;
        }
        if(id == 27){
            onPlanID = R.drawable.on27;
            s=11;
        }
        if(id == 28){
            onPlanID = R.drawable.on28;
            s=12;
        }
        if(id == 29){
            onPlanID = R.drawable.on29;
            s=13;
        }
        if(id == 30){
            onPlanID = R.drawable.on30;
            s=14;
        }
        if(id == 31){
            onPlanID = R.drawable.on31;
            s=15;
        }
        if(id == 32){
            onPlanID = R.drawable.on32;
            s=16;
        }
        if(id == 33){
            onPlanID = R.drawable.on33;
            s=17;
        }
        if(id ==34) {
            onPlanID = R.drawable.on34;
            s=18;
        }
        if(id == 35) {
            onPlanID = R.drawable.on35;
            s=19;
        }
        if(id ==36) {
            onPlanID = R.drawable.on36;
            s=20;
        }
        if(id ==37) {
            onPlanID = R.drawable.on37;
            s=21;
        }
        if(id ==38) {
            onPlanID = R.drawable.on38;
            s=22;
        }
        if(id ==39) {
            onPlanID = R.drawable.on39;
            s=23;
        }
        if(id ==40) {
            onPlanID = R.drawable.on40;
            s=24;
        }
        if(id ==41) {
            onPlanID = R.drawable.on41;
            s=17;
        }
        if(id ==42){
            onPlanID = R.drawable.on42;
            s=18;
        }
        if(id == 43){
            onPlanID = R.drawable.on43;
            s=19;
        }
        if(id == 44){
            onPlanID = R.drawable.on44;
            s=20;
        }
        if(id == 45){
            onPlanID = R.drawable.on45;
            s=21;
        }
        if(id == 46){
            onPlanID = R.drawable.on46;
            s=22;
        }
        if(id == 47){
            onPlanID = R.drawable.on47;
            s=23;
        }
        if(id == 48){
            onPlanID = R.drawable.on48;
            s=24;
        }*/

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

