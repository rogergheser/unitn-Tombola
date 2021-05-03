package it.unitn.lingprogmod1.rogergheser.tombola;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class BingoNumber extends StackPane {
    private int value;
    private boolean isPicked;
    public BingoNumber(int value) {
        this.value = value;
        this.isPicked = false;

        Circle circle = new Circle();
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);
        Text text = new Text(""+value);
        text.setFill(Color.GRAY);
        circle.setRadius(text.getFont().getSize());

        this.getChildren().addAll(circle, text);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean pickNumber() {
        return isPicked;
    }

    public void pick() {
        isPicked = true;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BingoNumber that = (BingoNumber) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
