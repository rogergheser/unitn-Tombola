package it.unitn.lingprogmod1.rogergheser.tombola;

import javafx.scene.layout.GridPane;

import java.util.LinkedList;
import java.util.Random;

public class BingoCard extends GridPane {
    private LinkedList<BingoNumber> cardNumbers = new LinkedList<>();
    private LinkedList<BingoNumber> extractedNumbers = new LinkedList<>();
    private Random random = new Random();

    public BingoCard() {
        BingoNumber number;

        for (int i=0; i<15; i++){
            int row = i/5   ;
            do {
            number = new BingoNumber(random.nextInt(90)+1);
            } while (cardNumbers.contains(number));
            cardNumbers.add(number);
            this.add(number, number.getValue()/10, row);
        }
        this.setGridLinesVisible(true);
    }

    public boolean checkNumber(BingoNumber number){
        boolean result = false;
        if (cardNumbers.contains(number)){
            result = true;
            markNumber(number);
        }

        return result;
    }

    private void markNumber(BingoNumber number){
        number.pickNumber();
    }
}
