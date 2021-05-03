package it.unitn.lingprogmod1.rogergheser.tombola;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Scene scene = new Scene(new BingoPlayer(3));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /*
    ADD COLUMN CONSTRAINTS
    BUILD HBox FOR PLAYERS
    ADD GAME HANDLER
     */

    public static void main(String[] args) {
        launch(args);
    }
}