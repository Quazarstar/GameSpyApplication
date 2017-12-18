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
            case "DARK SOULS\n":  textToShow = getString(R.string.darkSoul);
                break;
            case "FORTNITE\n":  textToShow = getString(R.string.fortnite);
                break;
            case "SKYRIM\n":  textToShow = getString(R.string.skyRim);
                break;
            case "SUPER\nMARIO\nTM\n":  textToShow = getString(R.string.superMario);
                break;
            case "CLASH OF\nCLANS\n": textToShow = getString(R.string.clashOfClan);
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
