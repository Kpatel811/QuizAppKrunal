package com.example.android.quizappkrunal;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    int finalScore = 0;
    String toastMessage;
    EditText q1Field;
    CheckBox q2_option1;
    CheckBox q2_option2;
    CheckBox q2_option3;
    CheckBox q2_option4;
    CheckBox q2_option5;
    CheckBox q2_option6;
    CheckBox q2_option7;
    RadioButton q3_option1;
    RadioButton q4_option3;
    RadioButton q5_option3;
    RadioButton q6_option2;
    RadioButton q7_option2;
    RadioGroup q3radioGroup;
    RadioGroup q4radioGroup;
    RadioGroup q5radioGroup;
    RadioGroup q6radioGroup;
    RadioGroup q7radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1Field = (EditText) findViewById(R.id.q1_option1);

        q2_option1 = (CheckBox) findViewById(R.id.q2_option1);
        q2_option2 = (CheckBox)findViewById(R.id.q2_option2);
        q2_option3 = (CheckBox) findViewById(R.id.q2_option3);
        q2_option4 = (CheckBox) findViewById(R.id.q2_option4);
        q2_option5 = (CheckBox) findViewById(R.id.q2_option5);
        q2_option6 = (CheckBox) findViewById(R.id.q2_option6);
        q2_option7 = (CheckBox) findViewById(R.id.q2_option7);
        q3_option1 = (RadioButton) findViewById(R.id.q3_option1);
        q4_option3 = (RadioButton) findViewById(R.id.q4_option3);
        q5_option3 = (RadioButton) findViewById(R.id.q5_option3);
        q6_option2 = (RadioButton) findViewById(R.id.q6_option2);
        q7_option2 = (RadioButton) findViewById(R.id.q7_option2);
        q3radioGroup = (RadioGroup)findViewById(R.id.question_3_choices);
        q4radioGroup = (RadioGroup)findViewById(R.id.question_4_choices);
        q5radioGroup = (RadioGroup)findViewById(R.id.question_5_choices);
        q6radioGroup = (RadioGroup)findViewById(R.id.question_6_choices);
        q7radioGroup = (RadioGroup)findViewById(R.id.question_7_choices);

    }




    public void submitQuiz(View view){

        //EditText q1Field = (EditText) findViewById(R.id.q1_option1);
        //q1Field = (EditText) findViewById(R.id.q1_option1);
        String q1Choice= q1Field.getText().toString();

        //CheckBox q2_option1 = (CheckBox) findViewById(R.id.q2_option1);
        //q2_option1 = (CheckBox) findViewById(R.id.q2_option1);
        boolean q2choice1= q2_option1.isChecked();

        //CheckBox q2_option2 = (CheckBox) findViewById(R.id.q2_option2);
        //q2_option2 = (CheckBox)findViewById(R.id.q2_option2);
        boolean q2choice2= q2_option2.isChecked();

        //CheckBox q2_option3= (CheckBox) findViewById(R.id.q2_option3);
        //q2_option3= (CheckBox) findViewById(R.id.q2_option3);
        boolean q2choice3= q2_option3.isChecked();

        //CheckBox q2_option4= (CheckBox) findViewById(R.id.q2_option4);
       // q2_option4= (CheckBox) findViewById(R.id.q2_option4);
        boolean q2choice4= q2_option4.isChecked();

        //CheckBox q2_option5= (CheckBox) findViewById(R.id.q2_option5);
        //q2_option5= (CheckBox) findViewById(R.id.q2_option5);
        boolean q2choice5= q2_option5.isChecked();

        //CheckBox q2_option6= (CheckBox) findViewById(R.id.q2_option6);
       // q2_option6= (CheckBox) findViewById(R.id.q2_option6);
        boolean q2choice6= q2_option6.isChecked();

        //CheckBox q2_option7= (CheckBox) findViewById(R.id.q2_option7);
        //q2_option7= (CheckBox) findViewById(R.id.q2_option7);
        boolean q2choice7= q2_option7.isChecked();


        //RadioButton q3_option1= (RadioButton) findViewById(R.id.q3_option1);
        //q3_option1= (RadioButton) findViewById(R.id.q3_option1);
        boolean q3choice= q3_option1.isChecked();


        //RadioButton q4_option3= (RadioButton) findViewById(R.id.q4_option3);
        //q4_option3= (RadioButton) findViewById(R.id.q4_option3);
        boolean q4choice= q4_option3.isChecked();

        //RadioButton q5_option3= (RadioButton) findViewById(R.id.q5_option3);
        //q5_option3= (RadioButton) findViewById(R.id.q5_option3);
        boolean q5choice= q5_option3.isChecked();

        //RadioButton q6_option2= (RadioButton) findViewById(R.id.q6_option2);
        //q6_option2= (RadioButton) findViewById(R.id.q6_option2);
        boolean q6choice= q6_option2.isChecked();

        //RadioButton q7_option2= (RadioButton) findViewById(R.id.q7_option2);
        //q7_option2= (RadioButton) findViewById(R.id.q7_option2);
        boolean q7choice= q7_option2.isChecked();


       finalScore = calculateScore(q1Choice, q2choice1, q2choice2, q2choice3, q2choice4, q2choice5, q2choice6, q2choice7, q3choice, q4choice, q5choice, q6choice, q7choice);

        Toast toast = Toast.makeText(getApplicationContext(), getString((R.string.your_final_score)) + ' ' + finalScore  + getString(R.string.out_of), Toast.LENGTH_LONG);
        toast.show();

        Log.v("score","score: " + finalScore);
        //String priceMessage = createOrderSummary(price, hasWhippedCream, hasChocolate, name);


    }

    public int calculateScore(String q1Choice, boolean q2choice1, boolean q2choice2,boolean q2choice3, boolean q2choice4, boolean q2choice5, boolean q2choice6, boolean q2choice7,boolean q3choice,boolean q4choice,boolean q5choice, boolean q6choice,boolean q7choice){

        int score = 0;

        if (q1Choice.equalsIgnoreCase("Willis Tower"))
            score = score + 1;
        if (q2choice1 == true && q2choice2 == true && q2choice3 == false && q2choice4 == true && q2choice5 == true && q2choice6 == true && q2choice7 == false)
            score = score + 1;
        if (q3choice == true)
            score = score + 1;
        if (q4choice == true)
            score = score + 1;
        if (q5choice == true)
            score = score + 1;
        if (q6choice == true)
            score = score + 1;
        if (q7choice == true)
            score = score + 1;
        return score;
    }

    public void resetQuiz (View view){
            q1Field.setText("");
            q2_option1.setChecked(false);
            q2_option2.setChecked(false);
            q2_option3.setChecked(false);
            q2_option4.setChecked(false);
            q2_option5.setChecked(false);
            q2_option6.setChecked(false);
            q2_option7.setChecked(false);

           //RadioGroup q3radioGroup = (RadioGroup)findViewById(R.id.question_3_choices);
        q3radioGroup.clearCheck();

        //RadioGroup q4radioGroup = (RadioGroup)findViewById(R.id.question_4_choices);
        q4radioGroup.clearCheck();

        //RadioGroup q5radioGroup = (RadioGroup)findViewById(R.id.question_5_choices);
        q5radioGroup.clearCheck();

        //RadioGroup q6radioGroup = (RadioGroup)findViewById(R.id.question_6_choices);
        q6radioGroup.clearCheck();

        //RadioGroup q7radioGroup = (RadioGroup)findViewById(R.id.question_7_choices);
        q7radioGroup.clearCheck();

        Toast toast = Toast.makeText(getApplicationContext(), getString((R.string.try_again)), Toast.LENGTH_LONG);
        toast.show();

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q3_option1:
                if (checked)
                    // q3 option 1
                    break;
            case R.id.q3_option2:
                if (checked)
                    // q3 option 2
                    break;
            case R.id.q3_option3:
                if (checked)
                    // q3 option 3
                    break;

        }
    }

    public void onRadioButtonQ4Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q4_option1:
                if (checked)
                    // q4 option 1
                    break;
            case R.id.q4_option2:
                if (checked)
                    // q4 option 2
                    break;
            case R.id.q4_option3:
                if (checked)
                    // q4 option 3
                    break;

        }
    }

    public void onRadioButtonQ5Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q5_option1:
                if (checked)
                    // q5 option 1
                    break;
            case R.id.q5_option2:
                if (checked)
                    // q5 option 2
                    break;
            case R.id.q5_option3:
                if (checked)
                    // q5 option 3
                    break;

        }
    }


    public void onRadioButtonQ6Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q6_option1:
                if (checked)
                    // q6 option 1
                    break;
            case R.id.q6_option2:
                if (checked)
                    // q6 option 2
                    break;
            case R.id.q6_option3:
                if (checked)
                    // q6 option 3
                    break;

        }
    }

    public void onRadioButtonQ7Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.q7_option1:
                if (checked)
                    // q7 option 1
                    break;
            case R.id.q7_option2:
                if (checked)
                    // q7 option 2
                    break;
            case R.id.q7_option3:
                if (checked)
                    // q7 option 3
                    break;

        }
    }


}
