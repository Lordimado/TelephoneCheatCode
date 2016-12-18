package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("rain.fxml"));
        primaryStage.setTitle("Just Call me");
        AudioClip sound = new AudioClip(this.getClass().getResource("rain2.mp3").toExternalForm());
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        sound.play(0.3);
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
