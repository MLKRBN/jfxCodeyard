module de.mkaufhol {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports de.mkaufhol.application;

    opens de.mkaufhol.controller to javafx.fxml;
}