package com.example.schiffeversenken;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Screen;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.Duration;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("startScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Schiffe versenken");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch();}
}