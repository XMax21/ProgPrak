package com.example.schiffeversenken;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SpielregelnController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //Join Fenster hinzugefügt indem man auf JoinButton klickt bei Player vs Player
    @FXML
    private Button JoinButton;
    @FXML
    private Button CreateGameButton;

    @FXML
    void handleButtonAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("JoinGame.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage = new Stage();
            stage.setTitle("JoinGame");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch ( Exception e){
            System.out.println("Cant load new Window");
        }
    }
    @FXML
    void handleButtonAction2(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateGame.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage = new Stage();
            stage.setTitle("CreateGame");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch ( Exception e){
            System.out.println("Cant load new Window");
        }
    }

    public void switchToGameSize(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SpielEinstellen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }}
