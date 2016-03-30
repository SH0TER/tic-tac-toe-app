package com.airdesign.chrestikiandnoliki.controllers;

import android.widget.Button;
import android.widget.TextView;

import com.airdesign.chrestikiandnoliki.R;
import com.airdesign.chrestikiandnoliki.models.TicTacToeModel;


/**
 * Created by Vlad on 30.03.2016.
 */
public class TicTacToeController {

    private static TicTacToeController instance;

    private TicTacToeController() {
    }

    public static synchronized TicTacToeController getInstance() {
        if (instance == null)
            instance = new TicTacToeController();
        return instance;
    }

    private static TicTacToeModel model = TicTacToeModel.getInstance();

    private Button[] buttons;
    private TextView humanScore;
    private TextView droidScore;

    private void drawButton(Button btn, int state) {
        if ( TicTacToeModel.NOUGHT == state)
            btn.setBackgroundResource(R.drawable.o);
        else if (TicTacToeModel.CROSS == state)
            btn.setBackgroundResource(R.drawable.x);
        else
            btn.setBackgroundResource(R.drawable.clear);
    }

    public void refreshGame() {
        for (int i = 0; i < buttons.length; i++)
            drawButton(buttons[i], model.getGameField()[i / 3][i % 3]);
        humanScore.setText(model.getHumanScore()+"");
        droidScore.setText(model.getDroidScore()+"");
    }

    public void setButtons(Button[] buttons) {
        this.buttons = buttons;
    }

    public void setScores(TextView humanScore, TextView droidScore) {
        this.humanScore = humanScore;
        this.droidScore = droidScore;
    }

}
