package com.airdesign.chrestikiandnoliki;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.airdesign.chrestikiandnoliki.models.TicTacToeModel;



public class Options extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        initButton();
    }

    private void initButton() {
        RadioButton easy = (RadioButton) findViewById(R.id.easy_radiobutton);
        easy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TicTacToeModel.getInstance().setDifficulty(TicTacToeModel.EASY_DIF);
            }
        });

        RadioButton medium = (RadioButton) findViewById(R.id.medium_radiobutton);
        medium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TicTacToeModel.getInstance().setDifficulty(TicTacToeModel.MEDIUM_DIF);
            }
        });

        RadioButton hard = (RadioButton) findViewById(R.id.hard_radiobutton);
        hard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TicTacToeModel.getInstance().setDifficulty(TicTacToeModel.HARD_DIF);
            }
        });

        switch (TicTacToeModel.getInstance().getDifficulty()) {
            case TicTacToeModel.EASY_DIF:
                easy.setChecked(true);
                break;
            case TicTacToeModel.MEDIUM_DIF:
                medium.setChecked(true);
                break;
            case TicTacToeModel.HARD_DIF:
                hard.setChecked(true);
                break;
        }
    };
}
