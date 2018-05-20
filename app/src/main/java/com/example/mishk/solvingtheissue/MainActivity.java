package com.example.mishk.solvingtheissue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.mishk.solvingtheissue.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeam1 = 0;
    int scoreTeam2 = 0;
    TextView scoreViewTeam1;
    TextView scoreViewTeam2;
    ImageButton onePointForTeam1;
    ImageButton twoPointsForTeam1;
    ImageButton threePointsForTeam1;
    ImageButton sixPointsForTeam1;
    ImageButton onePointForTeam2;
    ImageButton twoPointsForTeam2;
    ImageButton threePointsForTeam2;
    ImageButton sixPointsForTeam2;
    Button resetButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewTeam1 = findViewById(R.id.score_team1);
        scoreViewTeam2 = findViewById(R.id.score_team2);
        onePointForTeam1 = findViewById(R.id.onePointForTeam1);
        twoPointsForTeam1 = findViewById(R.id.TwoPointsForTeam1);
        threePointsForTeam1 = findViewById(R.id.ThreePointsForTeam1);
        sixPointsForTeam1 = findViewById(R.id.SixPointsForTeam1);
        onePointForTeam2 = findViewById(R.id.OnePointForTeam2);
        twoPointsForTeam2 = findViewById(R.id.TwoPointsForTeam2);
        threePointsForTeam2 = findViewById(R.id.ThreePointsForTeam2);
        sixPointsForTeam2 = findViewById(R.id.SixPointsForTeam2);
        resetButton = findViewById(R.id.reset_button);

    }

    public void displayScoreForTeam1(int scoreTeam1) {
        scoreViewTeam1.setText(String.valueOf(scoreTeam1));

    }

    public void addOnePointForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 1;
        displayScoreForTeam1(scoreTeam1);
    }

    public void addTwoPointsForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 2;
        displayScoreForTeam1(scoreTeam1);
    }

    public void addThreePointsForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 3;
        displayScoreForTeam1(scoreTeam1);
    }

    public void addSixPointsForTeam1(View view) {
        scoreTeam1 = scoreTeam1 + 6;
        displayScoreForTeam1(scoreTeam1);
    }

    public void displayScoreForTeam2(int scoreTeam2) {
        scoreViewTeam2.setText(String.valueOf(scoreTeam2));
    }

    public void addOnePointForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 1;
        displayScoreForTeam2(scoreTeam2);
    }

    public void addTwoPointsForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 2;
        displayScoreForTeam2(scoreTeam2);
    }

    public void addThreePointsForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 3;
        displayScoreForTeam2(scoreTeam2);
    }

    public void addSixPointsForTeam2(View view) {
        scoreTeam2 = scoreTeam2 + 6;
        displayScoreForTeam2(scoreTeam2);
    }

    public void resetScore(View view) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayScoreForTeam1(scoreTeam1);
        displayScoreForTeam2(scoreTeam2);
    }
}
