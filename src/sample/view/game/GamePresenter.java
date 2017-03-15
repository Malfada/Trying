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
                    schuifpuzzelModel.move(gameView.getGridPane().getChildren(), 0);
                    //gameView.getChildren().remove(1);
                    //gameView.setCenter(schuifpuzzelModel.makingImageViewGrid());
                } else {

                }
            }
        });

        gameView.getButton(1).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(1)){
                    schuifpuzzelModel.move(gameView.getGridPane().getChildren(), 1);
                    //gameView.getChildren().remove(1);
                    //gameView.setCenter(schuifpuzzelModel.makingImageViewGrid());
                } else {

                }

            }
        });

        gameView.getButton(2).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(2)){
                    schuifpuzzelModel.move(gameView.getGridPane().getChildren(), 2);
                    //gameView.getChildren().remove(1);
                    //gameView.setCenter(schuifpuzzelModel.makingImageViewGrid());
                } else {

                }
            }
        });

        gameView.getButton(3).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(3)){
                    schuifpuzzelModel.move(gameView.getGridPane().getChildren(), 3);
                    //gameView.getChildren().remove(1);
                    //gameView.setCenter(schuifpuzzelModel.makingImageViewGrid());
                } else {

                }
            }
        });

        gameView.getButton(4).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(4)){
                    schuifpuzzelModel.move(gameView.getGridPane().getChildren(), 4);
                    //gameView.getChildren().remove(1);
                    //gameView.setCenter(schuifpuzzelModel.makingImageViewGrid());
                } else {

                }
            }
        });

        gameView.getButton(5).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(5)){
                    schuifpuzzelModel.move(gameView.getGridPane().getChildren(), 5);
                    //gameView.getChildren().remove(1);
                    //gameView.setCenter(schuifpuzzelModel.makingImageViewGrid());
                } else {

                }
            }
        });

        gameView.getButton(6).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(6)){
                    schuifpuzzelModel.move(gameView.getGridPane().getChildren(), 6);
                    //gameView.getChildren().remove(1);
                    //gameView.setCenter(schuifpuzzelModel.makingImageViewGrid());
                } else {

                }
            }
        });

        gameView.getButton(7).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(7)){
                    schuifpuzzelModel.move(gameView.getGridPane().getChildren(), 7);
                    //gameView.getChildren().remove(1);
                    //gameView.setCenter(schuifpuzzelModel.makingImageViewGrid());
                } else {

                }
            }
        });

        gameView.getButton(8).setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(schuifpuzzelModel.canMove(8)){
                    schuifpuzzelModel.move(gameView.getGridPane().getChildren(), 8);
                    //gameView.getChildren().remove(1);
                    //gameView.setCenter(schuifpuzzelModel.makingImageViewGrid());
                } else {

                }
            }
        });


    }

    private void updateView() {

    }


}
