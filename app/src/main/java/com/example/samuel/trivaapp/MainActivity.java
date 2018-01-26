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

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    //Score keeper.
    private int score = 0;
    // make question objects
    Questions question1 = new Questions();
    Questions question2 = new Questions();
    Questions question3 = new Questions();
//    Questions question4 = new Questions();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rGroup1 = (RadioGroup) findViewById(R.id.first_question_group);
        RadioGroup rGroup2 = (RadioGroup) findViewById(R.id.second_question_group);
        RadioGroup rGroup3 = (RadioGroup) findViewById(R.id.third_question_group);
        rGroup1.setOnCheckedChangeListener(this);
        rGroup2.setOnCheckedChangeListener(this);
        rGroup3.setOnCheckedChangeListener(this);


    }
    // Test if the user pressed the corrected answer.
    public void onCheckedChanged(RadioGroup radioGroup, int id) {


        switch (radioGroup.getId()) {

            case R.id.first_question_group:
                if (id == R.id.correct_answer1) {
                    question1.setQuestion(true);
                }
                break;
            case R.id.second_question_group:
                if (radioGroup.getCheckedRadioButtonId() == R.id.correct_answer2) {
                    question2.setQuestion(true);
                }
                break;
            case R.id.third_question_group:
                if (radioGroup.getCheckedRadioButtonId() == R.id.correct_answer3) {
                    question3.setQuestion(true);
                }
                break;
        }


    }


    //used to diplay the users' score on screen.
    public void displayScore() {
        TextView scoreView = (TextView) findViewById(R.id.score_keeper);
        score = Questions.correct + Questions.wrong;
        scoreView.setText(Integer.toString(Questions.correct));

    }


    //used to submit tally results when button is pushed.
    public void submitResults(View view) {

        question1.questionAnswerTest();
        question2.questionAnswerTest();
        question3.questionAnswerTest();
        displayScore();
        score = 0;
        Questions.correct = 0;
        Questions.wrong = 0;
    }


}
