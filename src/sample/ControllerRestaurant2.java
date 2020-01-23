package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerRestaurant2 {

    @FXML
    Button BackPage;

    public void initialize(){
        BackPage.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../sample/Restaurant1.fxml"));
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
