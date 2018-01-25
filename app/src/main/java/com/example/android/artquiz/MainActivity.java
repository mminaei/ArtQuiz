package com.example.android.artquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    boolean isQ1AnswerCorrect, isQ2AnswerCorrect, isQ3AnswerCorrect, isQ41AnswerCorrect,
            isQ42AnswerCorrect, isQ43AnswerCorrect, isQ44AnswerCorrect,
            isQ45AnswerCorrect, isQ46AnswerCorrect, isQ47AnswerCorrect,
            isQ48AnswerCorrect, isQ5AnswerCorrect, isQ6AnswerCorrect;
    RadioButton question1RadioButton2;
    RadioButton question2RadioButton3;
    RadioButton question3RadioButton4;
    RadioButton question5RadioButton1;
    RadioButton question6RadioButton3;
    CheckBox question4CheckBox1;
    CheckBox question4CheckBox2;
    CheckBox question4CheckBox3;
    CheckBox question4CheckBox4;
    CheckBox question4CheckBox5;
    CheckBox question4CheckBox6;
    CheckBox question4CheckBox7;
    CheckBox question4CheckBox8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Create the Play Music button */
        final MediaPlayer playBeethoven = MediaPlayer.create(this, R.raw.beethoven);
        final Button playMusic = this.findViewById(R.id.button_music);
        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBeethoven.start();
            }
        });

        /* Creat the Play Video button */
        final Button playVideo = this.findViewById(R.id.button_video);
        playVideo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=F5zCGgZMaWQ")));
            }
        });

        /* To show the GIF file for Q6, we use Glide library*/
        Glide.with(this)
                .load(R.drawable.icecream)
                .into((ImageView) (findViewById(R.id.cooking)));


        /* Initializing RadioButtons and CheckBoxes */
        question1RadioButton2 = (RadioButton) findViewById(R.id.question1RadioButton2);
        question2RadioButton3 = (RadioButton) findViewById(R.id.question2RadioButton3);
        question3RadioButton4 = (RadioButton) findViewById(R.id.question3RadioButton4);
        question5RadioButton1 = (RadioButton) findViewById(R.id.question5RadioButton1);
        question6RadioButton3 = (RadioButton) findViewById(R.id.question6RadioButton3);
        question4CheckBox1 = (CheckBox) findViewById(R.id.question4CheckBox1);
        question4CheckBox2 = (CheckBox) findViewById(R.id.question4CheckBox2);
        question4CheckBox3 = (CheckBox) findViewById(R.id.question4CheckBox3);
        question4CheckBox4 = (CheckBox) findViewById(R.id.question4CheckBox4);
        question4CheckBox5 = (CheckBox) findViewById(R.id.question4CheckBox5);
        question4CheckBox6 = (CheckBox) findViewById(R.id.question4CheckBox6);
        question4CheckBox7 = (CheckBox) findViewById(R.id.question4CheckBox7);
        question4CheckBox8 = (CheckBox) findViewById(R.id.question4CheckBox8);
    }

    /* Method to calculate the final score */
    public int calculateScore() {
        int score = 0;

       /* Create a local boolean variable to check all the answers */
        boolean isAnswerCorrect;

       /* The correct answer to Q1 is choice 2 */
        isAnswerCorrect = question1RadioButton2.isChecked();
        if (isAnswerCorrect) {
           /* if the right button is checked, then the global variable for Q1 answer is set to true
            * then the Score is increased by 1. There is no negative point for wrong answer.
            */
            isQ1AnswerCorrect = true;
            score = score + 1;
        } else {
            isQ1AnswerCorrect = false;
        }

       /* The correct answer to Q2 is choice 3 */
        isAnswerCorrect = question2RadioButton3.isChecked();
        if (isAnswerCorrect) {
           /* if the right button is checked, then the global variable for Q2 answer is set to true
            * then the Score is increased by 1. There is no negative point for wrong answer.
            */
            isQ2AnswerCorrect = true;
            score = score + 1;
        } else {
            isQ2AnswerCorrect = false;
        }

       /* The correct answer to Q3 is choice 4 */
        isAnswerCorrect = question3RadioButton4.isChecked();
        if (isAnswerCorrect) {
           /* if the right button is checked, then the global variable for Q3 answer is set to true
            * then the Score is increased by 1. There is no negative point for wrong answer.
            */
            isQ3AnswerCorrect = true;
            score = score + 1;
        } else {
            isQ3AnswerCorrect = false;
        }

       /* The correct answer to Q4 is choice 2 and 7. The rest of them are wrong, so they should not be checked.
        * If wrong choices are checked, Score will decrease.
        */

        if (question4CheckBox1.isChecked()) {
          /* The choice is wrong, so set the global variable of this answer to false */
            isQ41AnswerCorrect = false;
        } else {
          /* This choice is wrong, so if it is unchecked, Score increases. */
            isQ41AnswerCorrect = true;
            score = score + 1;
        }

        isAnswerCorrect = question4CheckBox2.isChecked();
        if (isAnswerCorrect) {
           /* This choice is correct, so it should be checked to get a point. */
            isQ42AnswerCorrect = true;
            score = score + 1;
        } else {
           /* The choice is correct, so if unchecked we set the global variable of this answer to false */
            isQ42AnswerCorrect = false;
        }

        if (question4CheckBox3.isChecked()) {
          /* The choice is wrong, so set the global variable of this answer to false */
            isQ43AnswerCorrect = false;
        } else {
          /* This choice is wrong, so if it is unchecked, Score increases. */
            isQ43AnswerCorrect = true;
            score = score + 1;
        }
        if (question4CheckBox4.isChecked()) {
          /* The choice is wrong, so set the global variable of this answer to false */
            isQ44AnswerCorrect = false;
        } else {
          /* This choice is wrong, so if it is unchecked, Score increases. */
            isQ44AnswerCorrect = true;
            score = score + 1;
        }
        if (question4CheckBox5.isChecked()) {
          /* The choice is wrong, so set the global variable of this answer to false */
            isQ45AnswerCorrect = false;
        } else {
          /* This choice is wrong, so if it is unchecked, Score increases. */
            isQ45AnswerCorrect = true;
            score = score + 1;
        }
        if (question4CheckBox6.isChecked()) {
          /* The choice is wrong, so set the global variable of this answer to false */
            isQ46AnswerCorrect = false;
        } else {
          /* This choice is wrong, so if it is unchecked, Score increases. */
            isQ46AnswerCorrect = true;
            score = score + 1;
        }
        isAnswerCorrect = question4CheckBox7.isChecked();
        if (isAnswerCorrect) {
           /* This choice is correct, so it should be checked to get a point. */
            isQ47AnswerCorrect = true;
            score = score + 1;
        } else {
           /* The choice is correct, so if unchecked we set the global variable of this answer to false */
            isQ47AnswerCorrect = false;
        }

        if (question4CheckBox8.isChecked()) {
          /* The choice is wrong, so set the global variable of this answer to false */
            isQ48AnswerCorrect = false;
        } else {
           /* This choice is wrong, so if it is unchecked, Score increases. */
            isQ48AnswerCorrect = true;
            score = score + 1;
        }

       /* The correct answer to Q5 is choice 1 */
        isAnswerCorrect = question5RadioButton1.isChecked();
        if (isAnswerCorrect) {
            /* if the right button is checked, then the global variable for Q5 answer is set to true
            * then the Score is increased by 1. There is no negative point for wrong answer.
            */
            isQ5AnswerCorrect = true;
            score = score + 1;
        } else {
            isQ5AnswerCorrect = false;
        }

       /* The correct answer to Q6 is choice 3 */
        isAnswerCorrect = question6RadioButton3.isChecked();
        if (isAnswerCorrect) {
           /* if the right button is checked, then the global variable for Q6 answer is set to true
            * then the Score is increased by 1. There is no negative point for wrong answer.
            */
            isQ6AnswerCorrect = true;
            score = score + 1;
        } else {
            isQ6AnswerCorrect = false;
        }

       /* Return the final score */
        return score;
    }

    /* This method starts when the Score button is clicked*/
    public void gradeThemAll(View view) {

        /* First calculate the final Score */
        int score = calculateScore();

        /* Then show an appropriate message based on the Score */
        showToast(score,
                isQ1AnswerCorrect, isQ2AnswerCorrect, isQ3AnswerCorrect,
                isQ41AnswerCorrect, isQ42AnswerCorrect, isQ43AnswerCorrect,
                isQ44AnswerCorrect, isQ45AnswerCorrect, isQ46AnswerCorrect,
                isQ47AnswerCorrect, isQ48AnswerCorrect, isQ5AnswerCorrect,
                isQ6AnswerCorrect);
    }

    private void showToast(int score,
                           boolean isQ1AnswerCorrect, boolean isQ2AnswerCorrect, boolean isQ3AnswerCorrect,
                           boolean isQ41AnswerCorrect, boolean isQ42AnswerCorrect, boolean isQ43AnswerCorrect,
                           boolean isQ44AnswerCorrect, boolean isQ45AnswerCorrect, boolean isQ46AnswerCorrect,
                           boolean isQ47AnswerCorrect, boolean isQ48AnswerCorrect, boolean isQ5AnswerCorrect,
                           boolean isQ6AnswerCorrect) {

        /* Get the name of user */
        String name = ((EditText) findViewById(R.id.nameEditText)).getText().toString();

        /* Start making the Toast message */
        String gradedAnswers = "";

        /* First part of the Toast message is to announce final score and an appropriate message based on that. */
        switch (score) {
            case 11:
            case 12:
            case 13:
                String message = getResources().getString(R.string.gradedAnswersExcellent);
                gradedAnswers = String.format(message, name, score);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                gradedAnswers = getResources().getString(R.string.gradedAnswersGood);
                gradedAnswers = String.format(gradedAnswers, name, score);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                gradedAnswers = getResources().getString(R.string.gradedAnswersMedium);
                gradedAnswers = String.format(gradedAnswers, name, score);
                break;
            case -13:
            case -12:
            case -11:
            case -10:
            case -9:
            case -8:
            case -7:
            case -6:
            case -5:
            case -4:
            case -3:
            case -2:
            case -1:
            case 0:
            case 1:
            case 2:
                gradedAnswers = getResources().getString(R.string.gradedAnswersBad);
                gradedAnswers = String.format(gradedAnswers, name, score);
                break;
        }

        /* Check question 1. If no RadioButton is checked, show that user has not answered.
         * Then check if the correct RadioButton is checked.
         */
        if (((RadioGroup) findViewById(R.id.question1Answers)).getCheckedRadioButtonId() == -1) {
            gradedAnswers = gradedAnswers + "\n Question 1: Not Answered!";
        } else {
            if (isQ1AnswerCorrect) {
                gradedAnswers = gradedAnswers + "\n Question 1: Correct!";
            } else {
                gradedAnswers = gradedAnswers + "\n Question 1: Wrong!";
            }
        }

        /* Check question 2. If no RadioButton is checked, show that user has not answered.
         * Then check if the correct RadioButton is checked.
         */
        if (((RadioGroup) findViewById(R.id.question2Answers)).getCheckedRadioButtonId() == -1) {
            gradedAnswers = gradedAnswers + "\n Question 2: Not Answered!";
        } else {
            if (isQ2AnswerCorrect) {
                gradedAnswers = gradedAnswers + "\n Question 2: Correct!";
            } else {
                gradedAnswers = gradedAnswers + "\n Question 2: Wrong!";
            }
        }

        /* Check question 3. If no RadioButton is checked, show that user has not answered.
         * Then check if the correct RadioButton is checked.
         */
        if (((RadioGroup) findViewById(R.id.question3Answers)).getCheckedRadioButtonId() == -1) {
            gradedAnswers = gradedAnswers + "\n Question 3: Not Answered!";
        } else {
            if (isQ3AnswerCorrect) {
                gradedAnswers = gradedAnswers + "\n Question 3: Correct!";
            } else {
                gradedAnswers = gradedAnswers + "\n Question 3: Wrong!";
            }
        }


        /* Check question 4. This question has 8 CheckBoxes.
         * Both states of checked and unchecked affect Score, so there is no "Not Answered"
         */
        if (isQ41AnswerCorrect) {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 1: Correct!";
        } else {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 1: Wrong!";
        }
        if (isQ42AnswerCorrect) {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 2: Correct!";
        } else {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 2: Wrong!";
        }
        if (isQ43AnswerCorrect) {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 3: Correct!";
        } else {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 3: Wrong!";
        }
        if (isQ44AnswerCorrect) {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 4: Correct!";
        } else {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 4: Wrong!";
        }
        if (isQ45AnswerCorrect) {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 5: Correct!";
        } else {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 5: Wrong!";
        }
        if (isQ46AnswerCorrect) {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 6: Correct!";
        } else {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 6: Wrong!";
        }
        if (isQ47AnswerCorrect) {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 7: Correct!";
        } else {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 7: Wrong!";
        }
        if (isQ48AnswerCorrect) {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 8: Correct!";
        } else {
            gradedAnswers = gradedAnswers + "\n Question 4, Part 8: Wrong!";
        }

        /* Check question 5. If no RadioButton is checked, show that user has not answered.
         * Then check if the correct RadioButton is checked.
         */
        if (((RadioGroup) findViewById(R.id.question5Answers)).getCheckedRadioButtonId() == -1) {
            gradedAnswers = gradedAnswers + "\n Question 5: Not Answered!";
        } else {
            if (isQ5AnswerCorrect) {
                gradedAnswers = gradedAnswers + "\n Question 5: Correct!";
            } else {
                gradedAnswers = gradedAnswers + "\n Question 5: Wrong!";
            }
        }

        /* Check question 6. If no RadioButton is checked, show that user has not answered.
         * Then check if the correct RadioButton is checked.
         */
        if (((RadioGroup) findViewById(R.id.question6Answers)).getCheckedRadioButtonId() == -1) {
            gradedAnswers = gradedAnswers + "\n Question 6: Not Answered!";
        } else {
            if (isQ6AnswerCorrect) {
                gradedAnswers = gradedAnswers + "\n Question 6: Correct!";
            } else {
                gradedAnswers = gradedAnswers + "\n Question 6: Wrong!";
            }
        }

        /* Make the Toast stay longer (double the default) */
        for (int i = 0; i < 2; i++) {
            Toast.makeText(MainActivity.this, gradedAnswers, Toast.LENGTH_LONG).show();
        }
    }

}