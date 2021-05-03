package it.unitn.lingprogmod1.rogergheser.tombola;


import javafx.scene.layout.VBox;

public class BingoPlayer extends VBox {
    private int numberOfCards;
    public BingoPlayer(int numberOfCards) {
        if (numberOfCards!=0)
            this.numberOfCards = numberOfCards;
        else{
            System.out.println("Number of tables can't be 0. Number set to default value");
            this.numberOfCards = 1;
        }
        BingoCard[] playerCards = new BingoCard[this.numberOfCards];
        for (int i=0; i<numberOfCards; i++){
            playerCards[i] = new BingoCard(); //GO BACK AND CHANGE PARAMS
            this.getChildren().add(playerCards[i]);
        }
        this.setSpacing(5);
    }

}
