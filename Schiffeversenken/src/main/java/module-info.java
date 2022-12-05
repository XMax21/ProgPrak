module com.example.schiffeversenken {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.schiffeversenken to javafx.fxml;
    exports com.example.schiffeversenken;
}