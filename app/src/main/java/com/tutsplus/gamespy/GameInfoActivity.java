package com.tutsplus.gamespy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameInfoActivity extends AppCompatActivity {

    TextView gameInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_info);

        gameInfo = findViewById(R.id.gameText);

        String title = getIntent().getExtras().getString("TITLE");
        getSupportActionBar().setTitle(title);
        getContentBasedOnTitle(title);

    }

    public void getContentBasedOnTitle(String title) {
        String textToShow;
        switch (title) {
            case "DARK SOULS\n":  textToShow = "Dark souls is an action RPG made by From software and is widely claimed to be one of the toughest games out there on the market";
                break;
            case "FORTNITE\n":  textToShow = "Fortnite is a game developed by Epic games that is a battle royal style game currently free to play and a PvE game that is purchasable";
                break;
            case "SKYRIM\n":  textToShow = "Skyrim is the fifth elder scrolls game developed by Bethesda studios. A game that has made its claim to fame through the development of Elder scrolls and Skyrim games. ";
                break;
            case "SUPER MARIO\n":  textToShow = "Super mario is a long string of games of the Mario series made by nintendo, spanning across several consoles and widely reveared as one of the great kings of videogames.";
                break;
            default: textToShow = "Invalid title";
                break;
        }

        gameInfo.setText(textToShow);
    }



    public void goToLogoDetection(View view) {
        Intent intent = new Intent(this, LogoDetectionActivity.class);
        startActivity(intent);
    }
}
