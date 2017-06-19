package com.example.mckinnely.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of all push ups.
 */
public class MainActivity extends AppCompatActivity
{

    // Tracks the score for Team A
    int regularPushUps = 0;

    // Tracks the score for Team B
    int inclinePushUps = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase push ups by 15.
     */
    public void add15PushUps(View v)
    {
        regularPushUps = regularPushUps + 15;
        displayForTeamA(regularPushUps);
    }


    /**
     * Increase push ups by 25.
     */
    public void add25PushUps(View v)
    {
        regularPushUps = regularPushUps + 25;
        displayForTeamA(regularPushUps);
    }


    /**
     *Increase push ups by 50.
     */
    public void add50PushUPs(View v)
    {
        regularPushUps = regularPushUps + 50;
        displayForTeamA(regularPushUps);
    }



    /**
     * Increase push ups by 15.
     */
    public void add15DeclinePushUps(View v)
    {
        inclinePushUps = inclinePushUps + 15;
        displayForTeamB(inclinePushUps);
    }

    /**
     * Increase push ups by 25.
     */
    public void add25DeclinePushUps(View v)
    {
        inclinePushUps = inclinePushUps + 25;
        displayForTeamB(inclinePushUps);
    }

    /**
     * Increase push ups by 50.
     */
    public void add50DeclinePushUps(View v)
    {
        inclinePushUps = inclinePushUps + 50;
        displayForTeamB(inclinePushUps);
    }

    /**
     * Resets the all push ups to 0.
     */
    public void resetScore(View v)
    {
        regularPushUps = 0;
        inclinePushUps = 0;
        displayForTeamA(regularPushUps);
        displayForTeamB(inclinePushUps);
    }

    /**
     * Displays the given push up amount for regular push ups.
     */
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.regularPushUps);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given push up amount for incline push ups.
     */
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.declinePushUps);
        scoreView.setText(String.valueOf(score));
    }


}



