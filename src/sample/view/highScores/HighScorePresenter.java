package sample.view.highScores;

import sample.model.SchuifpuzzelModel;

/**
 * Created by Gebruiker on 12-3-2017.
 */
public class HighScorePresenter {
    private SchuifpuzzelModel schuifpuzzelModel;
    private HighScoreView highScoreView;

    public HighScorePresenter(SchuifpuzzelModel model, HighScoreView view) {
        this.schuifpuzzelModel = model;
        this.highScoreView = view;
        addEventHandlers();
    }

    private void addEventHandlers(){

    }
}
