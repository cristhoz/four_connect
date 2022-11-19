package dev.delahoz.four_connect;

import dev.delahoz.four_connect.config.properties.Properties;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FourConnectApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Properties properties = new Properties();

        FXMLLoader fxmlLoader = new FXMLLoader(FourConnectApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), properties.getScreenConfig().getViewSize().getWidth(),
            properties.getScreenConfig().getViewSize().getHeight());
        stage.setTitle(properties.getScreenConfig().getTitle());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}