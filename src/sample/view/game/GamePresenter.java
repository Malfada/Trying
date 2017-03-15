package sample.view.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.model.SchuifpuzzelModel;

public class GamePresenter {
    private SchuifpuzzelModel schuifpuzzelModel;
    private GameView gameView;

    public GamePresenter(SchuifpuzzelModel model, GameView view) {
        this.schuifpuzzelModel = model;
        this.gameView = view;
        addEventHandlers();
    }

    private void addEventHandlers(){

        gameView.getButton(0).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(0)){
                    schuifpuzzelModel.move(0);
                    updateView();
                } else {

                }
            }
        });

        gameView.getButton(1).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(1)){
                    schuifpuzzelModel.move(1);

                } else {

                }

            }
        });


    }

    private void updateView() {
        ;
    }


}
