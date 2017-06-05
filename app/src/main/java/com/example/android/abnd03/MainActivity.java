package com.example.android.abnd03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    *Method used to check the quiz answers, show the correct ones
    *in green and display a score with a toast message.
     */
    public void submit(View view) {
        //Checking control of the right button in question1
        RadioButton radioButtonOne = (RadioButton) findViewById(R.id.q1ans3);
        boolean checked1 = radioButtonOne.isChecked();
        if (checked1)
            score++;
        //Changes color of the text of the correct radio button to green
        radioButtonOne.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question2
        RadioButton radioButtonTwo = (RadioButton) findViewById(R.id.q2ans2);
        boolean checked2 = radioButtonTwo.isChecked();
        if (checked2)
            score++;
        //Changes color of the text of the correct radio button to green
        radioButtonTwo.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question3
        RadioButton radioButtonThree = (RadioButton) findViewById(R.id.q3ans1);
        boolean checked3 = radioButtonThree.isChecked();
        if (checked3)
            score++;
        //Changes color of the text of the correct radio button to green
        radioButtonThree.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question4
        RadioButton radioButtonFour = (RadioButton) findViewById(R.id.q4ans4);
        boolean checked4 = radioButtonFour.isChecked();
        if (checked4)
            score++;
        //Changes color of the text of the correct radio button to green
        radioButtonFour.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question5
        CheckBox chk5_1 = (CheckBox) findViewById(R.id.q5ans1);
        boolean checkedBox5_1 = chk5_1.isChecked();
        CheckBox chk5_2 = (CheckBox) findViewById(R.id.q5ans2);
        boolean checkedBox5_2 = chk5_2.isChecked();
        CheckBox chk5_3 = (CheckBox) findViewById(R.id.q5ans3);
        boolean checkedBox5_3 = chk5_3.isChecked();
        CheckBox chk5_4 = (CheckBox) findViewById(R.id.q5ans4);
        boolean checkedBox5_4 = chk5_4.isChecked();



        if (!checkedBox5_1 && checkedBox5_2 && checkedBox5_3 && !checkedBox5_4)


            score++;
        //Changes the color of the text of the correct checkboxes to green
        chk5_2.setTextColor(rgb(0, 255, 0));
        chk5_3.setTextColor(rgb(0, 255, 0));




        //Checking control of the right button in question6
        RadioButton radioButtonSix = (RadioButton) findViewById(R.id.q6ans3);
        boolean checked6 = radioButtonSix.isChecked();
        if (checked6)
            score++;
        //Changes color of the text of the correct radio button to green
        radioButtonSix.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question7
        RadioButton radioButtonSeven = (RadioButton) findViewById(R.id.q7ans2);
        boolean checked7 = radioButtonSeven.isChecked();
        if (checked7)
            score++;
        //Changes color of the text of the correct radio button to green
        radioButtonSeven.setTextColor(rgb(0, 255, 0));


        //Checking control of the right button in question8
        CheckBox chk8_1 = (CheckBox) findViewById(R.id.q8ans1);
        boolean checkedBox8_1 = chk8_1.isChecked();
        CheckBox chk8_2 = (CheckBox) findViewById(R.id.q8ans2);
        boolean checkedBox8_2 = chk8_2.isChecked();
        CheckBox chk8_3 = (CheckBox) findViewById(R.id.q8ans3);
        boolean checkedBox8_3 = chk8_3.isChecked();
        CheckBox chk8_4 = (CheckBox) findViewById(R.id.q8ans4);
        boolean checkedBox8_4 = chk8_4.isChecked();



        if (checkedBox8_1 && !checkedBox8_2 && !checkedBox8_3 && checkedBox8_4)


            score++;
            //Changes the color of the text of the correct checkboxes to green
            chk8_1.setTextColor(rgb(0, 255, 0));
            chk8_4.setTextColor(rgb(0, 255, 0));





        //Checking for correct answer in question 9
        EditText quest9Name = (EditText) findViewById(R.id.q9ans);

        if

                (quest9Name.getText().toString().equals(getString(R.string.ans9_2)))

        {
            score ++;
            //Changes the color of the answer to green if correct and show
            quest9Name.setText(getString(R.string.ans9_2));
            quest9Name.setTextColor(rgb(0, 255, 0));

        } else

        {
            //Displays the correct answer compared to the incorrect one in red color
            quest9Name.setText(quest9Name.getText());
            quest9Name.setTextColor(rgb(255, 0, 0));
        }

        //Only one click for submission
        Button myButton = (Button) findViewById(R.id.submit_button);
        myButton.setClickable(false);

        //Displays score in toast message
        Toast.makeText(this, getString(R.string.scoreIs) + " " + score +
                " " + getString(R.string.percent), Toast.LENGTH_LONG).show();
    }
}
