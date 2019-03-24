package com.example.android.rugby;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusFiveForTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
        updateRugbyPlayerImageForFivePoints();
    }

    public void plusTwoForTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
        updateRugbyPlayerImageForTwoPoints();
    }

    public void plusThreeForTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
        updateRugbyPlayerImageForThreePoints();
    }

    public void displayForTeamA(int score)
    {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void plusFiveForTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
        updateRugbyPlayerImageForFivePoints();
    }

    public void plusTwoForTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
        updateRugbyPlayerImageForTwoPoints();
    }

    public void plusThreeForTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
        updateRugbyPlayerImageForThreePoints();
    }


    public void displayForTeamB(int score)
    {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

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

    private void updateRugbyPlayerImageForFivePoints()
    {
        ImageView rugbyPlayerImage = findViewById(R.id.rugby_player_image);
        rugbyPlayerImage.setImageDrawable(null);
        rugbyPlayerImage.setBackgroundResource(R.drawable.try_5points_rugby);
    }

    private void updateRugbyPlayerImageForTwoPoints()
    {
        ImageView rugbyPlayerImage = findViewById(R.id.rugby_player_image);
        rugbyPlayerImage.setImageDrawable(null);
        rugbyPlayerImage.setBackgroundResource(R.drawable.conversion_2points_rugby);
    }

    private void updateRugbyPlayerImageForThreePoints()
    {
        ImageView rugbyPlayerImage = findViewById(R.id.rugby_player_image);
        rugbyPlayerImage.setImageDrawable(null);
        rugbyPlayerImage.setBackgroundResource(R.drawable.kickgoal_3_points_rugby);
    }
}
