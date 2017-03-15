package sample.model;

import javafx.scene.Node;
import javafx.scene.control.Button;

public class PuzzleButton extends Button {

    private boolean isEmptyImage;

    public PuzzleButton(String text, Node graphics, boolean isEmptyImage) {
        super(text, graphics);
        this.isEmptyImage = isEmptyImage;
    }

    public boolean isEmptyImage() {
        return this.isEmptyImage;
    }

}