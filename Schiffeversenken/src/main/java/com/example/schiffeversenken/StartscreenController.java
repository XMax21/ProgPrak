package com.example.schiffeversenken;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class StartscreenController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Text text;

    @FXML
    private ImageView image;

    @FXML
    private Button button;


    @FXML
    void startGame(KeyEvent event) {
        makeFadeOut();
    }

    private void makeFadeOut() {
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.seconds(3));
        fadeTransition.setNode(rootPane);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);

        fadeTransition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                loadNextScene();
            }
        });
        fadeTransition.play();
    }

    private void loadNextScene() {
        try {
            Parent nextView;
            nextView = FXMLLoader.load(getClass().getResource("menu.fxml"));

            Scene newScene = new Scene(nextView);

            Stage currStage = (Stage) rootPane.getScene().getWindow();
            currStage.setScene(newScene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
