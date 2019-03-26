package com.example.android.rugby;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add 5 point to Team A score and display when +5 button is clicked
     * Also update the Rugby player Image
     */
    public void plusFiveForTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
        updateRugbyPlayerImageForFivePoints();
    }

    /**
     * Add 2 point to Team A score and display when +2 button is clicked
     * Also update the Rugby player Image
     */
    public void plusTwoForTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
        updateRugbyPlayerImageForTwoPoints();
    }

    /**
     * Add 3 point to Team A score and display when +3 button is clicked
     * Also update the Rugby player Image
     */
    public void plusThreeForTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
        updateRugbyPlayerImageForThreePoints();
    }

    /**
     * Display the score for Team A
     */
    public void displayForTeamA(int score)
    {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Add 5 point to Team B score and display when +5 button is clicked
     * Also update the Rugby player Image
     */
    public void plusFiveForTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
        updateRugbyPlayerImageForFivePoints();
    }

    /**
     * Add 2 point to Team B score and display when +2 button is clicked
     * Also update the Rugby player Image
     */
    public void plusTwoForTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
        updateRugbyPlayerImageForTwoPoints();
    }

    /**
     * Add 3 point to Team B score and display when +3 button is clicked
     * Also update the Rugby player Image
     */
    public void plusThreeForTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
        updateRugbyPlayerImageForThreePoints();
    }

    /**
     * Display the score for Team A
     */
    public void displayForTeamB(int score)
    {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Reset score to 0 for Team A and Team B when reset button is clicked
     */
    public void resetScore(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        ImageView rugbyPlayerImage = findViewById(R.id.rugby_player_image);
        rugbyPlayerImage.setImageDrawable(null);
        rugbyPlayerImage.setBackgroundResource(R.drawable.start_rugby);
    }

    /**
     * Update Rugby Player image when +5 button is clicked
     */
    private void updateRugbyPlayerImageForFivePoints()
    {
        ImageView rugbyPlayerImage = findViewById(R.id.rugby_player_image);
        rugbyPlayerImage.setImageDrawable(null);
        rugbyPlayerImage.setBackgroundResource(R.drawable.try_5points_rugby);
    }

    /**
     * Update Rugby Player image when +2 button is clicked
     */
    private void updateRugbyPlayerImageForTwoPoints()
    {
        ImageView rugbyPlayerImage = findViewById(R.id.rugby_player_image);
        rugbyPlayerImage.setImageDrawable(null);
        rugbyPlayerImage.setBackgroundResource(R.drawable.conversion_2points_rugby);
    }

    /**
     * Update Rugby Player image when +3 button is clicked
     */
    private void updateRugbyPlayerImageForThreePoints()
    {
        ImageView rugbyPlayerImage = findViewById(R.id.rugby_player_image);
        rugbyPlayerImage.setImageDrawable(null);
        rugbyPlayerImage.setBackgroundResource(R.drawable.kickgoal_3_points_rugby);
    }
}
