package com.example.css_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import java.awt.Desktop;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.List;

public class Controller {
    @FXML
    private Label label;
    @FXML
    private Button button4;
    @FXML
    private GridPane gridpane;
    @FXML
    private Hyperlink hyperlink;
//    @FXML
//    private WebView webview;

    @FXML
    public void initialize() {
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void handleClick() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text", "*.txt"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );

//        DirectoryChooser chooser = new DirectoryChooser();
        List<File> file = chooser.showOpenMultipleDialog(gridpane.getScene().getWindow());
        if(file != null) {
            for(int i=0; i < file.size(); i++) {
                System.out.println(file.get(i));
            }
        } else {
            System.out.println("Chooser was cancelled");
        }
    }

    @FXML
    public void handleLinkClick() throws URISyntaxException {
        System.out.println("Link was clicked");
        // Open systems default browser
        try {
            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
        } catch(IOException | URISyntaxException err) {
            err.printStackTrace();
        }

        // Open webview in app
//        WebEngine engine = webview.getEngine();
//        engine.load("http://www.javafx.com");
    }
}