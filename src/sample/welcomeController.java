package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class welcomeController {

    @FXML
    Button login;

    @FXML
    Button register;
    @FXML
    Button guest;

    public void initialize(){

        login.setStyle("-fx-background-color: #c99c34");
        register.setStyle("-fx-background-color: #c99c34");
        guest.setStyle("-fx-background-color: #c99c34");

        login.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../sample/sample.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
            }catch(IOException e){
                e.printStackTrace();
            }
        });


        register.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../sample/register.fxml"));
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
