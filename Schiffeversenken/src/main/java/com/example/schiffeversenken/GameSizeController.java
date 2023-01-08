package com.example.schiffeversenken;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class GameSizeController implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private Slider mySlider;

    @FXML
    private GridPane myGridpane;

    int groesse;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        groesse = (int) mySlider.getValue();
        myLabel.setText(Integer.toString(groesse) + "x" + Integer.toString(groesse));

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                groesse = (int) mySlider.getValue();
                myLabel.setText(Integer.toString(groesse) + "x" + Integer.toString(groesse));

                for (int i = 0; i < groesse; i++) {
                    for (int j = 0; j < groesse; j++) {
                        myGridpane.add(new Button(), i, j);
                    }
                }

            }
        });
    }

}
