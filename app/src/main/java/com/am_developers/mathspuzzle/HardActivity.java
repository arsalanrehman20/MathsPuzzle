package com.am_developers.mathspuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class HardActivity extends AppCompatActivity {

    private int i = 1;
    private float score = 0;
    private String checkAnswerButton = "";

    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9;
    private Button ans1, ans2, ans3, ans4, ans5, ans6;
    private Button op1, op2, op3, op4, op5, op6, op7, op8, op9, op10;
    private TextView levelHead, sign1, sign2, sign3, sign4, sign5, sign6, sign7, sign8, sign9, sign10, sign11, sign12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);

        num1 = (Button) findViewById(R.id.MediumNum1);
        num2 = (Button) findViewById(R.id.MediumNum2);
        num3 = (Button) findViewById(R.id.MediumNum3);
        num4 = (Button) findViewById(R.id.MediumNum4);
        num5 = (Button) findViewById(R.id.MediumNum5);
        num6 = (Button) findViewById(R.id.MediumNum6);
        num7 = (Button) findViewById(R.id.MediumNum7);
        num8 = (Button) findViewById(R.id.MediumNum8);
        num9 = (Button) findViewById(R.id.MediumNum9);

        ans1 = (Button) findViewById(R.id.MediumAns1);
        ans2 = (Button) findViewById(R.id.MediumAns2);
        ans3 = (Button) findViewById(R.id.MediumAns3);
        ans4 = (Button) findViewById(R.id.MediumAns4);
        ans5 = (Button) findViewById(R.id.MediumAns5);
        ans6 = (Button) findViewById(R.id.MediumAns6);

        op1 = (Button) findViewById(R.id.option1);
        op2 = (Button) findViewById(R.id.option2);
        op3 = (Button) findViewById(R.id.option3);
        op4 = (Button) findViewById(R.id.option4);
        op5 = (Button) findViewById(R.id.option5);
        op6 = (Button) findViewById(R.id.option6);
        op7 = (Button) findViewById(R.id.option7);
        op8 = (Button) findViewById(R.id.option8);
        op9 = (Button) findViewById(R.id.option9);
        op10 = (Button) findViewById(R.id.option10);

        levelHead = (TextView) findViewById(R.id.idLevelText);
        sign1 = (TextView) findViewById(R.id.MediumSign1);
        sign2 = (TextView) findViewById(R.id.MediumSign2);
        sign3 = (TextView) findViewById(R.id.MediumSign3);
        sign4 = (TextView) findViewById(R.id.MediumSign4);
        sign5 = (TextView) findViewById(R.id.MediumSign5);
        sign6 = (TextView) findViewById(R.id.MediumSign6);
        sign7 = (TextView) findViewById(R.id.MediumSign7);
        sign8 = (TextView) findViewById(R.id.MediumSign8);
        sign9 = (TextView) findViewById(R.id.MediumSign9);
        sign10 = (TextView) findViewById(R.id.MediumSign10);
        sign11 = (TextView) findViewById(R.id.MediumSign11);
        sign12 = (TextView) findViewById(R.id.MediumSign12);

        levelHead.setText("LEVEL : " + i);
        num1.setText("27");
        num2.setText("9");
        num3.setText("9");
        num4.setText("9");
        num5.setText("0");
        num6.setText("2");
        num7.setText("2");
        num8.setText("4");
        num9.setText("17");

        sign1.setText("+");
        sign2.setText("+");
        sign3.setText("-");
        sign4.setText("-");
        sign5.setText("+");
        sign6.setText("*");
        sign7.setText("÷");
        sign8.setText("*");
        sign9.setText("-");
        sign10.setText("+");
        sign11.setText("*");
        sign12.setText("-");

        op1.setText("9");
        op2.setText("18");
        op3.setText("3");
        op4.setText("6");
        op5.setText("9");
        op6.setText("2");
        op7.setText("15");
        op8.setText("1");
        op9.setText("21");
        op10.setText("36");
    }

    public void onClickedOkButton(View view) {
        checkforScore();

        ++i;
        if(i<6)
        levelHead.setText("LEVEL : " + i);

        checkAnswerButton = "";
        changeOtherAnsBtnColor();

        /*Check Score on each level
        CharSequence s = String.valueOf(score);
        Toast toast = Toast.makeText(this, s, Toast.LENGTH_LONG);
        toast.show();*/

        if (i == 1) {

        } else if (i == 2) {
            num1.setText("14");
            num2.setText("4");
            num3.setText("2");
            num4.setText("1");
            num5.setText("15");
            num6.setText("1");
            num7.setText("8");
            num8.setText("0");
            num9.setText("9");

            ans1.setText("");
            ans2.setText("");
            ans3.setText("");
            ans4.setText("");
            ans5.setText("");
            ans6.setText("");

            op1.setText("3");
            op2.setText("5");
            op3.setText("11");
            op4.setText("14");
            op5.setText("9");
            op6.setText("1");
            op7.setText("15");
            op8.setText("2");
            op9.setText("0");
            op10.setText("7");

        } else if (i == 3) {
            num1.setText("27");
            num2.setText("5");
            num3.setText("14");
            num4.setText("7");
            num5.setText("4");
            num6.setText("2");
            num7.setText("7");
            num8.setText("0");
            num9.setText("20");

            ans1.setText("");
            ans2.setText("");
            ans3.setText("");
            ans4.setText("");
            ans5.setText("");
            ans6.setText("");

            op1.setText("15");
            op2.setText("42");
            op3.setText("9");
            op4.setText("27");
            op5.setText("3");
            op6.setText("7");
            op7.setText("1");
            op8.setText("4");
            op9.setText("14");
            op10.setText("3");
        } else if (i == 4) {
            num1.setText("21");
            num2.setText("2");
            num3.setText("20");
            num4.setText("5");
            num5.setText("1");
            num6.setText("2");
            num7.setText("3");
            num8.setText("5");
            num9.setText("8");

            ans1.setText("");
            ans2.setText("");
            ans3.setText("");
            ans4.setText("");
            ans5.setText("");
            ans6.setText("");

            op1.setText("1");
            op2.setText("0");
            op3.setText("21");
            op4.setText("4");
            op5.setText("5");
            op6.setText("13");
            op7.setText("15");
            op8.setText("8");
            op9.setText("2");
            op10.setText("9");
        } else if (i == 5) {
            num1.setText("15");
            num2.setText("8");
            num3.setText("6");
            num4.setText("3");
            num5.setText("5");
            num6.setText("2");
            num7.setText("3");
            num8.setText("2");
            num9.setText("9");

            ans1.setText("");
            ans2.setText("");
            ans3.setText("");
            ans4.setText("");
            ans5.setText("");
            ans6.setText("");

            op1.setText("15");
            op2.setText("4");
            op3.setText("5");
            op4.setText("6");
            op5.setText("1");
            op6.setText("8");
            op7.setText("2");
            op8.setText("9");
            op9.setText("7");
            op10.setText("3");
        }
        if (i == 6) {
            Intent intent = new Intent(this, ShowScoreActivity.class);
            intent.putExtra("Your Score", String.valueOf(score));
            startActivity(intent);

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

    public void onClickedOption9(View view) {
        optionsApplied(op9);
    }

    public void onClickedOption10(View view) {
        optionsApplied(op10);
    }

    public void optionsApplied(Button opt) {
        if (checkAnswerButton.equals("one"))
            ans1.setText(opt.getText().toString());
        else if (checkAnswerButton.equals("two"))
            ans2.setText(opt.getText().toString());
        else if (checkAnswerButton.equals("three"))
            ans3.setText(opt.getText().toString());
        else if (checkAnswerButton.equals("four"))
            ans4.setText(opt.getText().toString());
        else if (checkAnswerButton.equals("five"))
            ans5.setText(opt.getText().toString());
        else if (checkAnswerButton.equals("six"))
            ans6.setText(opt.getText().toString());
    }

    public void onClickedAnswer1(View view) {
        checkAnswerButton = "one";
        changeOtherAnsBtnColor();
    }

    public void onClickedAnswer2(View view) {
        checkAnswerButton = "two";
        changeOtherAnsBtnColor();
    }

    public void onClickedAnswer3(View view) {
        checkAnswerButton = "three";
        changeOtherAnsBtnColor();
    }

    public void onClickedAnswer4(View view) {
        checkAnswerButton = "four";
        changeOtherAnsBtnColor();
    }

    public void onClickedAnswer5(View view) {
        checkAnswerButton = "five";
        changeOtherAnsBtnColor();
    }

    public void onClickedAnswer6(View view) {
        checkAnswerButton = "six";
        changeOtherAnsBtnColor();
    }

    public void changeOtherAnsBtnColor() {

        if (checkAnswerButton.equals("one")) {
            ans1.setBackgroundResource(R.drawable.border_button);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
            ans5.setBackgroundResource(R.drawable.rounded_button_white);
            ans6.setBackgroundResource(R.drawable.rounded_button_white);
        } else if (checkAnswerButton.equals("two")) {
            ans2.setBackgroundResource(R.drawable.border_button);
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
            ans5.setBackgroundResource(R.drawable.rounded_button_white);
            ans6.setBackgroundResource(R.drawable.rounded_button_white);
        } else if (checkAnswerButton.equals("three")) {
            ans3.setBackgroundResource(R.drawable.border_button);
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
            ans5.setBackgroundResource(R.drawable.rounded_button_white);
            ans6.setBackgroundResource(R.drawable.rounded_button_white);
        } else if (checkAnswerButton.equals("four")) {
            ans4.setBackgroundResource(R.drawable.border_button);
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
            ans5.setBackgroundResource(R.drawable.rounded_button_white);
            ans6.setBackgroundResource(R.drawable.rounded_button_white);
        } else if (checkAnswerButton.equals("five")) {
            ans5.setBackgroundResource(R.drawable.border_button);
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
            ans6.setBackgroundResource(R.drawable.rounded_button_white);
        } else if (checkAnswerButton.equals("six")) {
            ans6.setBackgroundResource(R.drawable.border_button);
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
            ans5.setBackgroundResource(R.drawable.rounded_button_white);
        } else {
            ans1.setBackgroundResource(R.drawable.rounded_button_white);
            ans2.setBackgroundResource(R.drawable.rounded_button_white);
            ans3.setBackgroundResource(R.drawable.rounded_button_white);
            ans4.setBackgroundResource(R.drawable.rounded_button_white);
            ans5.setBackgroundResource(R.drawable.rounded_button_white);
            ans6.setBackgroundResource(R.drawable.rounded_button_white);
        }
    }

    public void checkforScore() {

        if (i == 1) {
            if (ans1.getText().equals("9"))
                score += 3.5;
            if (ans2.getText().equals("9"))
                score += 3.5;
            if (ans3.getText().equals("2"))
                score += 3.5;
            if (ans4.getText().equals("9"))
                score += 3.5;
            if (ans5.getText().equals("3"))
                score += 3.5;
            if (ans6.getText().equals("6"))
                score += 2.5;
        } else if (i == 2) {
            if (ans1.getText().equals("3"))
                score += 3.5;
            if (ans2.getText().equals("7"))
                score += 3.5;
            if (ans3.getText().equals("2"))
                score += 3.5;
            if (ans4.getText().equals("5"))
                score += 3.5;
            if (ans5.getText().equals("2"))
                score += 3.5;
            if (ans6.getText().equals("1"))
                score += 2.5;
        } else if (i == 3) {
            if (ans1.getText().equals("7"))
                score += 3.5;
            if (ans2.getText().equals("15"))
                score += 3.5;
            if (ans3.getText().equals("4"))
                score += 3.5;
            if (ans4.getText().equals("42"))
                score += 3.5;
            if (ans5.getText().equals("1"))
                score += 3.5;
            if (ans6.getText().equals("3"))
                score += 2.5;
        } else if (i == 4) {
            if (ans1.getText().equals("15"))
                score += 3.5;
            if (ans2.getText().equals("4"))
                score += 3.5;
            if (ans3.getText().equals("8"))
                score += 3.5;
            if (ans4.getText().equals("0"))
                score += 3.5;
            if (ans5.getText().equals("1"))
                score += 3.5;
            if (ans6.getText().equals("2"))
                score += 2.5;
        } else if (i == 5) {
            if (ans1.getText().equals("1"))
                score += 3.5;
            if (ans2.getText().equals("6"))
                score += 3.5;
            if (ans3.getText().equals("4"))
                score += 3.5;
            if (ans4.getText().equals("8"))
                score += 3.5;
            if (ans5.getText().equals("2"))
                score += 3.5;
            if (ans6.getText().equals("1"))
                score += 2.5;
        }
    }
}
