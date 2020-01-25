package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.print.Book;
import java.io.IOException;

public class ChoiceController {

    @FXML
    Button SeeRest;
    @FXML
    Button BookTable;
    @FXML
    Button SearchLocation;


    public void initialize(){

        SeeRest.setStyle("-fx-background-color: #c99c34");
        BookTable.setStyle("-fx-background-color: #c99c34");
        SearchLocation.setStyle("-fx-background-color: #c99c34");

        SeeRest.setOnAction(event -> {
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

        BookTable.setOnAction(e -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../sample/Choice.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) e.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
            }catch(IOException E){
                E.printStackTrace();
            }
            });

        SearchLocation.setOnAction(ev ->{
            try {
                Parent root = FXMLLoader.load(getClass().getResource("../sample/search.fxml"));
                Scene scene = new Scene(root);
                Stage window = (Stage) ((Node) ev.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
            }catch(IOException Ex){
                Ex.printStackTrace();
            }
        });
    }
}
