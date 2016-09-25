package com.example.rameez.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore = 0;
    int teamBscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }*/
    //For Team A
    public void addOneForA(View view){
        teamAscore =teamAscore+1;
        displayTeamA(teamAscore);
    }
    public void addTwoForA(View view){
        teamAscore =teamAscore+2;
        displayTeamA(teamAscore);
    }
    public void addThreeForA(View view){
        teamAscore =teamAscore+3;
        displayTeamA(teamAscore);
    }
    public void displayTeamA(int score){
        TextView tv = (TextView) findViewById(R.id.team_a_score);
        tv.setText(""+score);
    }
    //For team B
    public void addOneForB(View view){
        teamBscore =teamBscore+1;
        displayTeamB(teamBscore);
    }
    public void addTwoForB(View view){
        teamBscore =teamBscore+2;
        displayTeamB(teamBscore);
    }
    public void addThreeForB(View view){
        teamBscore =teamBscore+3;
        displayTeamB(teamBscore);
    }
    public void displayTeamB(int score){
        TextView tv = (TextView) findViewById(R.id.team_b_score);
        tv.setText(""+score);
    }
    public void reset(View view){
        displayTeamA(0);
        displayTeamB(0);
        teamAscore = 0;
        teamBscore = 0;
    }
}
