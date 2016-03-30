package com.airdesign.chrestikiandnoliki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.airdesign.chrestikiandnoliki.models.TicTacToeModel;


public class MainActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View continueGameButton = findViewById(R.id.continue_button);
        continueGameButton.setOnClickListener(this);
        View newGameButton = findViewById(R.id.new_game_button);
        newGameButton.setOnClickListener(this);
        View optionsButton = findViewById(R.id.options_button);
        optionsButton.setOnClickListener(this);
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.continue_button:
                startActivity(new Intent(this, Game.class));
                break;
            case R.id.new_game_button:
                TicTacToeModel.getInstance().newGame();
                startActivity(new Intent(this, Game.class));
                break;
            case R.id.options_button:
                startActivity(new Intent(this, Options.class));
                break;
            case R.id.about_button:
                startActivity(new Intent(this, About.class));
                break;
            default:
                break;
        }

    }
}
