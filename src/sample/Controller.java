package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    @FXML
    protected TextField num;
    @FXML
    protected TextField PoliceMessage;
    @FXML
    protected TextField FireMessage;
    @FXML
    protected Button IneedPolice;
    @FXML
    protected Button IneedFireman;
    @FXML
    protected Pane FirePane;
    @FXML
    protected Pane PolicePane;

    @FXML
    /**-----------------Redirection Vers la Cabine-----------------------------------*/
    public void ToCabine(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("cabineIn.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
        AudioClip sound = new AudioClip(this.getClass().getResource("rain2.mp3").toExternalForm());
        sound.play(0.1);
    }

    @FXML
    /**-----------------Redirection Vers Park-----------------------------------*/
    public void ToPark(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("rain.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
        AudioClip sound = new AudioClip(this.getClass().getResource("rain1.mp3").toExternalForm());
        sound.play(0.05);
    }

    @FXML
    /**-----------------Redirection Vers Cabine --> Book -----------------------------------*/
    public void ToBook(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("Book.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
        AudioClip sound = new AudioClip(this.getClass().getResource("rain1.mp3").toExternalForm());
        sound.play(0.05);
    }

    @FXML
    /**-----------------Redirection Vers Cabine --> Photo-----------------------------------*/
    public void ToPhoto(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("photo.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
        AudioClip sound = new AudioClip(this.getClass().getResource("rain1.mp3").toExternalForm());
        sound.play(0.05);
    }

    @FXML
    /**-----------------Redirection Vers Cabine --> Phone -----------------------------------*/
    public void ToPhone(ActionEvent actionEvent) throws IOException {
        Parent page = FXMLLoader.load(getClass().getResource("telephoneNum.fxml"));
        Scene scene = new Scene(page);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
        AudioClip sound = new AudioClip(this.getClass().getResource("rain1.mp3").toExternalForm());
        sound.play(0.05);
        AudioClip sound1 = new AudioClip(this.getClass().getResource("Coin.mp3").toExternalForm());
        sound1.play(0.5);
    }

    @FXML
    public void tapNum(ActionEvent actionEvent){
        Button button = (Button)actionEvent.getSource();
        if(button.getId().equals("zero")){
            num.appendText("0");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("one")){
            num.appendText("1");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("two")){
            num.appendText("2");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("three")){
            num.appendText("3");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("four")){
            num.appendText("4");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("five")){
            num.appendText("5");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("six")){
            num.appendText("6");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("seven")){
            num.appendText("7");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("eight")){
            num.appendText("8");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("nine")){
            num.appendText("9");
            AudioClip sound = new AudioClip(this.getClass().getResource("ButtonSound.mp3").toExternalForm());
            sound.play(0.5);
        }

        if(button.getId().equals("Retry")){
            num.setText("");
        }

        if(num.getText().equals("911")){
            PoliceMessage.setVisible(true);
            FireMessage.setVisible(true);
            IneedPolice.setVisible(true);
            IneedFireman.setVisible(true);
            AudioClip sound = new AudioClip(this.getClass().getResource("Police911.mp3").toExternalForm());
            sound.play(0.5);

            if(button.getId().equals("IneedPolice")){
                PoliceMessage.setVisible(false);
                FireMessage.setVisible(false);
                IneedPolice.setVisible(false);
                IneedFireman.setVisible(false);
                PolicePane.setVisible(true);
            }
            if(button.getId().equals("IneedFireman")){
                PoliceMessage.setVisible(false);
                FireMessage.setVisible(false);
                IneedPolice.setVisible(false);
                IneedFireman.setVisible(false);
                FirePane.setVisible(true);
            }
        }

        if (num.getText().equals("555161")){
            AudioClip sound = new AudioClip(this.getClass().getResource("BusySignal.mp3").toExternalForm());
            sound.play(0.5);
        }

        if (num.getText().equals("555522")){
            AudioClip sound = new AudioClip(this.getClass().getResource("Ringing.mp3").toExternalForm());
            sound.play(0.5);
        }

        if (num.getText().equals("555685")){
            AudioClip sound = new AudioClip(this.getClass().getResource("BusySignal.mp3").toExternalForm());
            sound.play(0.5);
        }

        if (num.getText().equals("555055")){
            AudioClip sound = new AudioClip(this.getClass().getResource("MrBeanHello.mp3").toExternalForm());
            sound.play(0.5);
        }

        if (num.getText().equals("555128")){
            AudioClip sound = new AudioClip(this.getClass().getResource("BusySignal.mp3").toExternalForm());
            sound.play(0.5);
        }

        if (num.getText().equals("555989")){
            AudioClip sound = new AudioClip(this.getClass().getResource("BusySignal.mp3").toExternalForm());
            sound.play(0.5);
        }

        if (num.getText().equals("555183")){
            AudioClip sound = new AudioClip(this.getClass().getResource("Helloman1.mp3").toExternalForm());
            sound.play(0.5);
        }

        if (num.getText().equals("555951")){
            AudioClip sound = new AudioClip(this.getClass().getResource("Hellooldman1.mp3").toExternalForm());
            sound.play(0.5);
        }

        if (num.getText().equals("555666")){
            AudioClip sound = new AudioClip(this.getClass().getResource("mustapha.mp3").toExternalForm());
            sound.play(0.8);
        }

    }
}
