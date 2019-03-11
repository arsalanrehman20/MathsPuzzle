package com.am_developers.mathspuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class ShowScoreActivity extends AppCompatActivity {

    float score=0;
    TextView textViewScore, textViewRemarks;

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this,MainMenuActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_score);

        textViewScore=(TextView)findViewById(R.id.textviewScore);
        textViewRemarks=(TextView)findViewById(R.id.textviewRemarks);

        Bundle getScore = getIntent().getExtras();
        if(getScore==null)
            return;
        else {
            score=Float.parseFloat( getScore.getString("Your Score"));
            textViewScore.setText("Score : " + Math.round(score) + " out of 100");

            if(score>=80)
                textViewRemarks.setText("Congratulation");
            else if(score>=70)
                textViewRemarks.setText("Very Good");
            else if(score>=60)
                textViewRemarks.setText("Great Effort");
            else if(score>=50)
                textViewRemarks.setText("Not Bad");
            else if(score<50)
                textViewRemarks.setText("Improve your maths please");
        }
    }

    public void onClickedBacktoMainMenu(View view) {
        Intent i = new Intent(this,MainMenuActivity.class);
        startActivity(i);
    }
}
