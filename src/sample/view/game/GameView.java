package sample.view.game;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 * Created by Gebruiker on 12-3-2017.
 */
public class GameView extends GridPane {
    private Button button;

    public GameView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        this.button = new Button("oi");
    }

    private void layoutNodes() {
        this.getChildren().add(button);
    }
}
