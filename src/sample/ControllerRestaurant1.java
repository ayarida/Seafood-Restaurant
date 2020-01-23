package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerRestaurant1 {

    @FXML
    Button NextPage;

    public void initialize(){
        NextPage.setOnAction(e -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../sample/Restaurant2.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) e.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
            }catch(IOException E){
                E.printStackTrace();
            }
        });
    }
}