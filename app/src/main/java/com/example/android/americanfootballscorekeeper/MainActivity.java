package com.example.android.americanfootballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int visitorScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHomeScore(0);
    }

    /**
     * This method is called when the Home Team's TouchDown button is clicked.
     */
    public void TDHome(View view) {
        homeScore = homeScore + 6;
        displayForHomeScore(homeScore);
    }

    /**
     * This method is called when the Home Team's Extra Point button is clicked.
     */
    public void extraPointHome(View view) {
        homeScore = homeScore + 1;
        displayForHomeScore(homeScore);
    }

    /**
     * This method is called when the Home Team's Two Point Conversion button is clicked.
     */
    public void twoPointConversionHome(View view) {
        homeScore = homeScore + 2;
        displayForHomeScore(homeScore);
    }

    /**
     * This method is called when the Home Team's Field Goal button is clicked.
     */
    public void fieldGoalHome(View view) {
        homeScore = homeScore + 3;
        displayForHomeScore(homeScore);
    }

    /**
     * This method is called when the Home Team's Safety button is clicked.
     */
    public void safetyHome(View view) {
        homeScore = homeScore + 2;
        displayForHomeScore(homeScore);
    }

    /**
     * Displays the given score for the Home Team.
     */
    public void displayForHomeScore(int homeScore) {
        TextView scoreView = (TextView) findViewById(R.id.home_score);
        scoreView.setText(String.valueOf(homeScore));
    }

    /**
     * This method is called when the Visiting Team's TouchDown button is clicked.
     */
    public void TDVisitor(View view) {
        visitorScore = visitorScore + 6;
        displayForVisitorTeam(visitorScore);
    }

    /**
     * This method is called when the Visiting Team's Extra Point button is clicked.
     */
    public void extraPointVisitor(View view) {
        visitorScore = visitorScore + 1;
        displayForVisitorTeam(visitorScore);
    }

    /**
     * This method is called when the Visiting Team's Two Point Conversion button is clicked.
     */
    public void twoPointConversionVisitor(View view) {
        visitorScore = visitorScore + 2;
        displayForVisitorTeam(visitorScore);
    }

    /**
     * This method is called when the Visiting Team's Field Goal is clicked.
     */
    public void fieldGoalVisitor(View view) {
        visitorScore = visitorScore + 3;
        displayForVisitorTeam(visitorScore);
    }

    /**
     * This method is called when the Visiting Team's Safety button is clicked.
     */
    public void safetyVisitor(View view) {
        visitorScore = visitorScore + 2;
        displayForVisitorTeam(visitorScore);
    }

    /**
     * Displays the given score for Visiting Team.
     */
    public void displayForVisitorTeam(int visitorScore) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_score);
        scoreView.setText(String.valueOf(visitorScore));
    }

    public void newGame(View view) {
        homeScore = 0;
        visitorScore = 0;
        displayForHomeScore(homeScore);
        displayForVisitorTeam(visitorScore);

    }
}
