package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**This adds 3 points to TeamA**/
    public void threepoints (View view) {

        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }
    /**This adds 2 points to TeamA**/
    public void twopoints (View view) {

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }
    /**This adds 1 point to TeamA**/
    public void onepoint (View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }


    /**This adds 3 points to TeamB**/
    public void threepointsB (View view) {

        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }
    /**This adds 2 points to TeamB**/
    public void twopointsB (View view) {

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }
    /**This adds 1 point to TeamB**/
    public void onepointB (View view) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    /**This returns both scores to 0**/
    public void resetButton (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



}
