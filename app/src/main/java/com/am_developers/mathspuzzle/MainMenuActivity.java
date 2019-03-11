package com.am_developers.mathspuzzle;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainMenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    public void onClickedEasy(View view) {
        Intent intent = new Intent(MainMenuActivity.this, EasyActivity.class);
        startActivity(intent);
    }

    public void onClickedMedium(View view) {
        Intent intent = new Intent(MainMenuActivity.this, MediumActivity.class);
        startActivity(intent);
    }

    public void onClickedHard(View view) {
        Intent intent = new Intent(MainMenuActivity.this, HardActivity.class);
        startActivity(intent);
    }

    public void onClickedBtnDev(View view) {
        openDeveloperDialogue();
    }

    public void onClickedRateApp(View view) {
        openRateAppDialogue();
    }

    public void openDeveloperDialogue() {
        Dialog alert = new Dialog(this);
        alert.setContentView(R.layout.layout_developer_dialogue);
        ImageView img = alert.findViewById(R.id.DevimageView);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.devimage);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        img.setImageDrawable(roundedBitmapDrawable);
        alert.show();
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.addCategory(Intent.CATEGORY_HOME);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    public void openRateAppDialogue() {
        Dialog alert = new Dialog(this);
        alert.setContentView(R.layout.layout_rateapp_dialogue);
        alert.setTitle("Please give your feedback : ");
        alert.show();

        final ImageView i1 = alert.findViewById(R.id.imageStar1);
        final ImageView i2 = alert.findViewById(R.id.imageStar2);
        final ImageView i3 = alert.findViewById(R.id.imageStar3);
        final ImageView i4 = alert.findViewById(R.id.imageStar4);
        final ImageView i5 = alert.findViewById(R.id.imageStar5);
        final Button btn = alert.findViewById(R.id.btnSubmitRating);
        btn.setTextColor(Color.BLACK);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageResource(R.drawable.blackstar);
                i2.setImageResource(R.drawable.borderstar);
                i3.setImageResource(R.drawable.borderstar);
                i4.setImageResource(R.drawable.borderstar);
                i5.setImageResource(R.drawable.borderstar);
                btn.setText("Thankyou!");
                btn.setBackgroundResource(R.drawable.border_button);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageResource(R.drawable.blackstar);
                i2.setImageResource(R.drawable.blackstar);
                i3.setImageResource(R.drawable.borderstar);
                i4.setImageResource(R.drawable.borderstar);
                i5.setImageResource(R.drawable.borderstar);
                btn.setText("Thankyou!");
                btn.setBackgroundResource(R.drawable.border_button);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageResource(R.drawable.blackstar);
                i2.setImageResource(R.drawable.blackstar);
                i3.setImageResource(R.drawable.blackstar);
                i4.setImageResource(R.drawable.borderstar);
                i5.setImageResource(R.drawable.borderstar);
                btn.setText("Thankyou!");
                btn.setBackgroundResource(R.drawable.border_button);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageResource(R.drawable.blackstar);
                i2.setImageResource(R.drawable.blackstar);
                i3.setImageResource(R.drawable.blackstar);
                i4.setImageResource(R.drawable.blackstar);
                i5.setImageResource(R.drawable.borderstar);
                btn.setText("Thankyou!");
                btn.setBackgroundResource(R.drawable.border_button);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setImageResource(R.drawable.blackstar);
                i2.setImageResource(R.drawable.blackstar);
                i3.setImageResource(R.drawable.blackstar);
                i4.setImageResource(R.drawable.blackstar);
                i5.setImageResource(R.drawable.blackstar);
                btn.setText("Thankyou!");
                btn.setBackgroundResource(R.drawable.border_button);
            }
        });
    }
}

