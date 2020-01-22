package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
public class ControllerMain {

    @FXML
    Button continue1;
    public void initialize(){
        continue1.setStyle("-fx-background-color: #dd994c");
        continue1.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../sample/welcome.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
            }catch(IOException e){
                e.printStackTrace();
            }
        });

    }
}
