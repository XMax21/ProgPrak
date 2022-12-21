package com.example.schiffeversenken;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;

public class MenuController {
    @FXML
    void closeGame(ActionEvent event){
        Platform.exit();
    }


    //Choose Game Starter für die jeweiligen Auswahlmöglichkeiten
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToPlayervsCom(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PlayerVsCom.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPlayervsPlayer(ActionEvent event)throws IOException {
        root = FXMLLoader.load(getClass().getResource("PlayerVsPlayer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToComvsCom(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ComVsCom.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSpielregeln(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("spielregeln.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
