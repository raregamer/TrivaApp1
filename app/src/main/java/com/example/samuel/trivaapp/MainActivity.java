package com.example.samuel.trivaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    //Score keeper.
    private int score = 0;
    // determines if the selected was right or wrong, then used to add up the score.
    private boolean question1 = false;
    private boolean question2 = false;
    private boolean question3 = false;
//    private boolean question3 = false;
//    private boolean question4 = false;
//    private boolean question5 = false;
//    private boolean question6 = false;
//    private boolean question7 = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //used to diplay the players previous score on screen.
    public void displayScore() {
        TextView scoreView = (TextView) findViewById(R.id.score_keeper);
        scoreView.setText(Integer.toString(score));
    }

    //used to submit results with button and tally score.
    public void submitResults(View view){

        question1();
        question2();
        question3();
        displayScore();
        score = 0;
    }


    //selector for radioGroup1 check if id matches correct answer.
    public void radioGroup1(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Log.wtf("what","view.getId");

        switch (view.getId()) {
            case R.id.correct_answer1:
                if (checked)
                    //Log.wtf("whatif","view.getId");
                    question1 = true;
                break;

            default:
                //Log.wtf("whatelse","view.getId");
                question1 = false;
        }

    }

    //submit results calls this to find out if the answer was correct for question 1 to use for tally.
    public void question1() {
        if(question1) {
            score++;
        } else {
            score--;
        }


    }




    //selector for radioGroup2 check if id matches correct answer.
    public void radioGroup2(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Log.wtf("what","view.getId");

        switch (view.getId()) {
            case R.id.correct_answer2:
                if (checked)
                    //Log.wtf("whatif","view.getId");
                    question2 = true;
                break;

            default:
                //Log.wtf("whatelse","view.getId");
                question2 = false;
        }

    }

    //submit results calls this to find out if the answer was correct for question 2 to use for tally.
    public void question2() {
        if(question2) {
            score++;
        } else {
            score--;
        }


    }



    //selector for radioGroup3 check if id matches correct answer.
    public void radioGroup3(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        //Log.wtf("what","view.getId");

        switch (view.getId()) {
            case R.id.correct_answer3:
                if (checked)
                    //Log.wtf("whatif","view.getId");
                    question3 = true;
                break;

            default:
                //Log.wtf("whatelse","view.getId");
                question3 = false;
        }

    }

    //submit results calls this to find out if the answer was correct for question 3 to use for tally.
    public void question3() {
        if(question3) {
            score++;
        } else {
            score--;
        }


    }







}
