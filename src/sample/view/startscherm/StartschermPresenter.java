package sample.view.startscherm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.model.SchuifpuzzelModel;
import sample.view.highScores.HighScorePresenter;
import sample.view.highScores.HighScoreView;
import sample.view.spelkeuze.SpelkeuzePresenter;
import sample.view.spelkeuze.SpelkeuzeView;

public class StartschermPresenter {
    private SchuifpuzzelModel schuifpuzzelModel;
    private StartschermView startschermView;

    public StartschermPresenter(SchuifpuzzelModel model, StartschermView view) {
        this.schuifpuzzelModel = model;
        this.startschermView = view;
        addEventHandlers();
    }

    private void addEventHandlers() {
        startschermView.getPlaybtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SpelkeuzeView spelkeuzeView = new SpelkeuzeView();
                SpelkeuzePresenter spelkeuzePresenter = new SpelkeuzePresenter(schuifpuzzelModel, spelkeuzeView);
                startschermView.getScene().setRoot(spelkeuzeView);
                spelkeuzeView.getScene().getWindow().sizeToScene();
            }
        });

        startschermView.gethScorebtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                HighScoreView highScoreView = new HighScoreView();
                HighScorePresenter highScorePresenter = new HighScorePresenter(schuifpuzzelModel, highScoreView);
                startschermView.getScene().setRoot(highScoreView);
                highScoreView.getScene().getWindow().sizeToScene();
            }
        });

        startschermView.getExitbtn().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
    }


}
