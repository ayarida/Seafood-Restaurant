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

    @FXML
    Button home;


    public void initialize(){

        home.setOnAction(ex -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../sample/Choice.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) ex.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
            }catch(IOException Ex){
                Ex.printStackTrace();
            }
        });


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
