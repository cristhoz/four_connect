package dev.delahoz.four_connect.views;

import dev.delahoz.four_connect.config.properties.Properties;
import javafx.scene.Scene;

public class HomeView extends Views {
    public HomeView() {
        Properties properties = new Properties();

        loadView("home-view.fxml");
        scene = new Scene(layout, properties.getScreenConfig().getViewSize().getWidth(), properties.getScreenConfig()
                .getViewSize().getHeight());
    }
}
