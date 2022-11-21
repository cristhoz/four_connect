package dev.delahoz.four_connect.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public abstract class Views {
    Parent layout;

    Scene scene;

    void loadView(String view) {
        try {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource(view));
            layout = loader.load();
        } catch (IOException e) {
            throw new RuntimeException("Error to load fxml for home-view", e);
        }
    }

    public Scene getScene() {
        return scene;
    }
}
