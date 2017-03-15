package sample.view.game;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import sample.model.SchuifpuzzelModel;

public class GameView extends BorderPane {
    private Label hasToBeReplacedByTimer;
    private GridPane gridPane;

    public GameView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        hasToBeReplacedByTimer = new Label("missing");
        gridPane = new SchuifpuzzelModel().makingImageViewGrid();
    }

    private void layoutNodes() {
        setTop(hasToBeReplacedByTimer);
        setCenter(gridPane);
    }

    GridPane getGridPane() {
        return gridPane;
    }

    Button getButton(int index) {
        return (Button) getGridPane().getChildren().get(index);
    }
}
