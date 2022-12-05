package com.example.schiffeversenken;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.Duration;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Schiffe versenken");
        stage.setScene(scene);
        Duration duration = Duration.ofSeconds(3);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}