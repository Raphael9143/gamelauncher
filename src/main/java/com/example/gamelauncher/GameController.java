package com.example.gamelauncher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class GameController {
    private Scene scene;
    private Stage stage;
    private Parent root;
    @FXML private TextArea textArea;
    @FXML
    public void switchToBattleShip(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("BattleShip.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToHangMan(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("HangMan.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}