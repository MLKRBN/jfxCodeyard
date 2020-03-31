package de.mkaufhol.application;

import de.mkaufhol.controller.MainController;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainApp extends Application {

    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent content;
        FXMLLoader viewLoader = new FXMLLoader();
        viewLoader.setLocation(getClass().getResource("/fxml/codeyard.fxml"));
        content = viewLoader.load();
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        stage = new Stage();
        stage.setTitle("Codeyard Application");
        stage.setScene(new Scene(content, 480, 150));
        stage.setX(primaryScreenBounds.getMinX() + primaryScreenBounds.getWidth() - 490);
        stage.setY(primaryScreenBounds.getMinY() + primaryScreenBounds.getHeight() - 180);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
