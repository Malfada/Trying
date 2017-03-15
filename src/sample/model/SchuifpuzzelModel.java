package sample.model;

import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Collections;

public class SchuifpuzzelModel {
    private ArrayList<Button> buttonList;
    private ArrayList<Integer> controlArrayList;
    private ArrayList<Integer> randomizedArrayList;
    private final int size = 16;
    private int dimension;
    private int hole;

    public SchuifpuzzelModel() {
        dimension = (int)Math.sqrt(this.size);
        setArrayLists();
        setRandomizedArrayList();
        buttonList = new ArrayList<>();
    }

    private void setArrayLists() {                      //initialize ArrayLists
        controlArrayList = new ArrayList<>();
        randomizedArrayList = new ArrayList<>();
        for(int i = 1 ; i <= size ; i++) {
            controlArrayList.add(i);
            randomizedArrayList.add(i);
        }
    }

    private void setRandomizedArrayList() {             //randomizing the random List
        Collections.shuffle(randomizedArrayList);
    }

    public GridPane makingImageViewGrid() {
        GridPane gridPane = new GridPane();
        String dir = "sample/view/images/spel1/nr_%d.gif";
        int indexOfCurrentElement = 0;
        for(int row = 0; row < this.dimension; row++) {
            for(int column = 0; column < this.dimension; column++) {
                int currentElement = randomizedArrayList.get(indexOfCurrentElement);
                String url = String.format(dir, currentElement);
                boolean isEmptyImage = url.equals("sample/view/images/spel1/nr_4.gif");
                PuzzleButton tempButton = new PuzzleButton("", new ImageView(new Image(url)), isEmptyImage);
                //now just do tempButton.isEmptyImage() to check if it is the empty image
                gridPane.add(tempButton, column , row);
                buttonList.add(tempButton);
                if(currentElement == 4) {               //if white picture set hole = index of the picture
                    hole = indexOfCurrentElement;
                }
                indexOfCurrentElement++;
            }
        }
        return gridPane;
    }

    public Button getButton(int index) {
        return buttonList.get(index);
    }

    public int getDimension() {
        return dimension;
    }

    public int getHole() {
        return hole;
    }

    public boolean canMove(int indexOfButton) {
        if (indexOfButton < 0 || indexOfButton >= size) {
            return false;                   // No such position
        }
        int diff = this.hole - indexOfButton;
        if (diff == -1) {                   // Slide tile left (hole goes right)
            return indexOfButton % dimension != 0;         // ... unless tile is on left edge
        } else if (diff == +1) {            // Slide tile right (hole goes left)
            return this.hole % dimension != 0;   // ... unless hole is on left edge
        } else {
            return Math.abs(diff) == dimension;  // Slide vertically
        }
    }

    public void move(ObservableList observableList,int indexOfButton) {
        Collections.swap(randomizedArrayList, indexOfButton, hole);

        Collections.swap(observableList, indexOfButton, hole);

        this.hole = indexOfButton;
    }
}
