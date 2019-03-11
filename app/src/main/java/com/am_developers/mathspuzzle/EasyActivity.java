package com.am_developers.mathspuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class EasyActivity extends AppCompatActivity {

    private int i = 1;
    private int score = 0;
    private String checkAnswerButton="";

    private Button num1, num2, num3, num4, ans1, ans2, ans3, ans4;
    private Button op1, op2, op3, op4, op5, op6, op7, op8;
    private TextView levelHead, sign1, sign2, sign3, sign4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        num1 = (Button) findViewById(R.id.Num1);
        num2 = (Button) findViewById(R.id.Num2);
        num3 = (Button) findViewById(R.id.Num3);
        num4 = (Button) findViewById(R.id.Num4);

        ans1 = (Button) findViewById(R.id.Ans1);
        ans2 = (Button) findViewById(R.id.Ans2);
        ans3 = (Button) findViewById(R.id.Ans3);
        ans4 = (Button) findViewById(R.id.Ans4);

        op1 = (Button) findViewById(R.id.option1);
        op2 = (Button) findViewById(R.id.option2);
        op3 = (Button) findViewById(R.id.option3);
        op4 = (Button) findViewById(R.id.option4);
        op5 = (Button) findViewById(R.id.option5);
        op6 = (Button) findViewById(R.id.option6);
        op7 = (Button) findViewById(R.id.option7);
        op8 = (Button) findViewById(R.id.option8);

        levelHead = (TextView) findViewById(R.id.idLevelText);
        sign1 = (TextView) findViewById(R.id.sign1);
        sign2 = (TextView) findViewById(R.id.sign2);
        sign3 = (TextView) findViewById(R.id.sign3);
        sign4 = (TextView) findViewById(R.id.sign4);

        levelHead.setText("LEVEL : "+i);
        num1.setText("8");
        num2.setText("2");
        num3.setText("1");
        num4.setText("4");

        sign1.setText("+");
        sign2.setText("-");
        sign3.setText("*");
        sign4.setText("+");

        op1.setText("5");
        op2.setText("9");
        op3.setText("13");
        op4.setText("7");
        op5.setText("2");
        op6.setText("8");
        op7.setText("10");
        op8.setText("21");
    }

    public void onClickedOkButton(View view) {

        checkforScore();

        ++i;
        if(i<6)
        levelHead.setText("LEVEL : "+i);

        checkAnswerButton="";
        changeOtherAnsBtnColor();

        /*Check Score on each level
        CharSequence s=String.valueOf(score);
        Toast toast= Toast.makeText(this,s,Toast.LENGTH_LONG);
        toast.show();*/

        if(i==1){

        }
        else if(i==2){
            num1.setText("4");
            num2.setText("2");
            num3.setText("3");
            num4.setText("8");

            ans1.setText("");
            ans2.setText("");
            ans3.setText("");
            ans4.setText("");

            op1.setText("10");
            op2.setText("1");
            op3.setText("6");
            op4.setText("11");
            op5.setText("0");
            op6.setText("9");
            op7.setText("16");
            op8.setText("4");

        }
        else if(i==3){
            num1.setText("9");
            num2.setText("3");
            num3.setText("2");
            num4.setText("5");

            ans1.setText("");
            ans2.setText("");
            ans3.setText("");
            ans4.setText("");

            op1.setText("11");
            op2.setText("7");
            op3.setText("8");
            op4.setText("4");
            op5.setText("15");
            op6.setText("12");
            op7.setText("3");
            op8.setText("1");

        }
        else if(i==4){
            num1.setText("10");
            num2.setText("10");
            num3.setText("9");
            num4.setText("3");

            ans1.setText("");
            ans2.setText("");
            ans3.setText("");
            ans4.setText("");

            op1.setText("4");
            op2.setText("20");
            op3.setText("1");
            op4.setText("9");
            op5.setText("8");
            op6.setText("30");
            op7.setText("6");
            op8.setText("12");

        }

        else if(i==5){
            num1.setText("6");
            num2.setText("30");
            num3.setText("6");
            num4.setText("1");

            ans1.setText("");
            ans2.setText("");
            ans3.setText("");
            ans4.setText("");

            op1.setText("0");
            op2.setText("7");
            op3.setText("1");
            op4.setText("9");
            op5.setText("4");
            op6.setText("30");
            op7.setText("36");
            op8.setText("12");
        }
        if(i==6){
            Intent intent = new Intent(this,ShowScoreActivity.class);
            intent.putExtra("Your Score",String.valueOf(score));
            startActivity(intent);
        }
    }

    public void onClickedAnswer1(View view) {
        checkAnswerButton="one";
        changeOtherAnsBtnColor();
    }

    public void onClickedAnswer2(View view) {
        checkAnswerButton="two";
        changeOtherAnsBtnColor();
    }

    public void onClickedAnswer3(View view) {
        checkAnswerButton="three";
        changeOtherAnsBtnColor();
    }

    public void onClickedAnswer4(View view) {
        checkAnswerButton="four";
        changeOtherAnsBtnColor();
    }

    public  void changeOtherAnsBtnColor(){

        if(checkAnswerButton.equals("one")){
            ans1.setBackgroundResource(R.drawable.border_button);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
        }
        else if(checkAnswerButton.equals("two")){
            ans2.setBackgroundResource(R.drawable.border_button);
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
        }
        else if(checkAnswerButton.equals("three")){
            ans3.setBackgroundResource(R.drawable.border_button);
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
        }
        else if(checkAnswerButton.equals("four")){
            ans4.setBackgroundResource(R.drawable.border_button);
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
        }
        else{
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
        }
    }

    public void onClickedOption1(View view) {
        optionsApplied(op1);
    }

    public void onClickedOption2(View view) {
        optionsApplied(op2);
    }

    public void onClickedOption3(View view) {
        optionsApplied(op3);
    }

    public void onClickedOption4(View view) {
        optionsApplied(op4);
    }

    public void onClickedOption5(View view) {
        optionsApplied(op5);
    }

    public void onClickedOption6(View view) {
        optionsApplied(op6);
    }

    public void onClickedOption7(View view) {
        optionsApplied(op7);
    }

    public void onClickedOption8(View view) {
        optionsApplied(op8);
    }

    public void optionsApplied(Button opt){
        if(checkAnswerButton.equals("one"))
            ans1.setText(opt.getText().toString());
        else if(checkAnswerButton.equals("two"))
            ans2.setText(opt.getText().toString());
        else if(checkAnswerButton.equals("three"))
            ans3.setText(opt.getText().toString());
        else if(checkAnswerButton.equals("four"))
            ans4.setText(opt.getText().toString());
    }

    public void checkforScore() {
        if (i == 1) {
            if(ans1.getText().equals("10"))
                score+=5;
            if(ans2.getText().equals("5"))
                score+=5;
            if(ans3.getText().equals("7"))
                score+=5;
            if(ans4.getText().equals("8"))
                score+=5;
        }

        else if (i == 2) {
            if(ans1.getText().equals("6"))
                score+=5;
            if(ans2.getText().equals("11"))
                score+=5;
            if(ans3.getText().equals("1"))
                score+=5;
            if(ans4.getText().equals("16"))
                score+=5;
        }

        else if (i == 3) {
            if(ans1.getText().equals("12"))
                score+=5;
            if(ans2.getText().equals("7"))
                score+=5;
            if(ans3.getText().equals("7"))
                score+=5;
            if(ans4.getText().equals("15"))
                score+=5;
        }

        else if (i == 4) {
            if(ans1.getText().equals("20"))
                score+=5;
            if(ans2.getText().equals("12"))
                score+=5;
            if(ans3.getText().equals("1"))
                score+=5;
            if(ans4.getText().equals("30"))
                score+=5;
        }

        else if (i == 5) {
            if(ans1.getText().equals("36"))
                score+=5;
            if(ans2.getText().equals("7"))
                score+=5;
            if(ans3.getText().equals("0"))
                score+=5;
            if(ans4.getText().equals("30"))
                score+=5;
        }

    }
}
