package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int reboundsTeamA = 0;
    int reboundsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addReboundsForTeamA(View view) {
        reboundsTeamA = reboundsTeamA + 1;
        displayReboundsForTeamA(reboundsTeamA);
    }

    public void addReboundsForTeamB(View view) {
        reboundsTeamB = reboundsTeamB + 1;
        displayReboundsForTeamB(reboundsTeamB);
    }

    public void resetScore(View view) {

        scoreTeamA = 0;
        scoreTeamB = 0;
        reboundsTeamA = 0;
        reboundsTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayReboundsForTeamA(reboundsTeamA);
        displayReboundsForTeamB(reboundsTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayReboundsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_rebounds);
        scoreView.setText(String.valueOf(score));
    }

    public void displayReboundsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_rebounds);
        scoreView.setText(String.valueOf(score));
    }
}
