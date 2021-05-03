package it.unitn.lingprogmod1.rogergheser.tombola;

import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Banco extends GridPane {
    private List<BingoNumber> numbers = new LinkedList<>();
    private List<BingoNumber> extractedNumbers = new LinkedList<>();

    public Banco() {
        for (int i=0; i<90; i++){
            int row = i/3;
            int column = i%3;
            BingoNumber bingoNumber = new BingoNumber(i+1);
            numbers.add(bingoNumber);
            this.add(new Text(""+bingoNumber.getValue()), column , row);
        }
        Collections.shuffle(numbers);
    }

    private BingoNumber extract(){
        int extractionIndex = extractedNumbers.size();
        BingoNumber retValue = numbers.remove(extractionIndex);
        extractedNumbers.add(retValue);
        return retValue;
    }

    public void announce(){
        System.out.println("Extracting number...");
        System.out.println("...and the number is " + extract().toString());
    }

}
