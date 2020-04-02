package de.mkaufhol.controller;

import javafx.beans.property.ObjectProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class MainController {

    private boolean started = false;

    @FXML
    private Label labelCount;
    @FXML
    private TextField textfieldCounter;

    @FXML
    public void startLiveCount() {
        if (started == false) {
            textfieldCounter.setOnKeyTyped(event -> count());
            started = true;
        }
        else {

        }
    }

    @FXML
    public void clearTextfield() {
        textfieldCounter.clear();
        labelCount.setText("Zeichenzähler: 0");
    }

    @FXML
    public void pressedCopy() {
        copy();
    }

    @FXML
    public void pressedPaste() {
       paste();
    }

    private void count() {
        Integer length = textfieldCounter.getText().length();
        labelCount.setText("Zeichenzähler: " + length.toString());

        if (length > 0) {

        }
    }

    private void copy() {
        ClipboardContent content = new ClipboardContent();
        content.putString(textfieldCounter.getText());
        Clipboard.getSystemClipboard().setContent(content);
    }

    private void paste() {
        textfieldCounter.setText(Clipboard.getSystemClipboard().getString());
    }
}
