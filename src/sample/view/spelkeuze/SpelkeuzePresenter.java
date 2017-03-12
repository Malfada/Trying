package sample.view.spelkeuze;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.model.SchuifpuzzelModel;
import sample.view.game.GamePresenter;
import sample.view.game.GameView;

/**
 * Created by Dynah Hemeleers on 12/03/2017.
 */
public class SpelkeuzePresenter {
    private SchuifpuzzelModel model;
    private SpelkeuzeView view;

    public SpelkeuzePresenter(SchuifpuzzelModel model, SpelkeuzeView view){
        this.model = model;
        this.view = view;
        addEventHandlers();
    }

    private void addEventHandlers(){
        view.getSpel1().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GameView gameView = new GameView();
                GamePresenter gamePresenter = new GamePresenter(model, gameView);
                view.getScene().setRoot(gameView);
                gameView.getScene().getWindow().sizeToScene();
            }
        });

        view.getSpel2().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GameView gameView = new GameView();
                GamePresenter gamePresenter = new GamePresenter(model, gameView);
                view.getScene().setRoot(gameView);
                gameView.getScene().getWindow().sizeToScene();
            }
        });

        view.getSpel3().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GameView gameView = new GameView();
                GamePresenter gamePresenter = new GamePresenter(model, gameView);
                view.getScene().setRoot(gameView);
                gameView.getScene().getWindow().sizeToScene();
            }
        });
    }

}