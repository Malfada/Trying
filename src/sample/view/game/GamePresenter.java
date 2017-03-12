package sample.view.game;

import sample.model.SchuifpuzzelModel;

/**
 * Created by Gebruiker on 12-3-2017.
 */
public class GamePresenter {
    private SchuifpuzzelModel schuifpuzzelModel;
    private GameView gameView;

    public GamePresenter(SchuifpuzzelModel model, GameView view) {
        this.schuifpuzzelModel = model;
        this.gameView = view;
        addEventHandlers();
    }

    private void addEventHandlers(){

    }

}
