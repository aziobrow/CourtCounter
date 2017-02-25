package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int turnoverTeamA = 0;
    int turnoverTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the turnovers for Team A.
     */
    public void displayTurnoverForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_turnover);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to score for Team A
     */
    public void threePointerForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 2 points to score for Team A
     */
    public void twoPointerForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 1 point to score for Team A
     */
    public void freeThrowForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 1 turnover to Team A
     */
    public void turnoverTeamA(View view) {
        turnoverTeamA = turnoverTeamA + 1;
        displayTurnoverForTeamA(turnoverTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayTurnoverForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_turnover);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to score for Team B
     */
    public void threePointerForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 2 points to score for Team B
     */
    public void twoPointerForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 1 point to score for Team B
     */
    public void freeThrowForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 1 turnover to Team A
     */
    public void turnoverTeamB(View view) {
        turnoverTeamB = turnoverTeamB + 1;
        displayTurnoverForTeamB(turnoverTeamB);
    }

    /**
     * Resets Team A and Team B score to 0
     */
    public void resetScoresToZero(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets Team A and Team B turnovers to 0
     */

    public void resetTurnoversToZero(View view) {
        turnoverTeamA = 0;
        turnoverTeamB = 0;
        displayTurnoverForTeamA(turnoverTeamA);
        displayTurnoverForTeamB(turnoverTeamB);
    }
}


