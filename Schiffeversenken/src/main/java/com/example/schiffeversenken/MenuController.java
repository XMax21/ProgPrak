package com.example.schiffeversenken;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.controlsfx.control.action.Action;

public class MenuController {
    @FXML
    void closeGame(ActionEvent event){
        Platform.exit();
    }
}
