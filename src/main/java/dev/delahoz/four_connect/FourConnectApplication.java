package dev.delahoz.four_connect;

import dev.delahoz.four_connect.config.properties.Properties;
import dev.delahoz.four_connect.route.Router;
import dev.delahoz.four_connect.route.Routes;
import javafx.application.Application;
import javafx.stage.Stage;

public class FourConnectApplication extends Application {
    @Override
    public void start(Stage stage) {
        Properties properties = new Properties();

        stage.setTitle(properties.getScreenConfig().getTitle());

        Router.setStage(stage);
        Router.setRoute(Routes.Home);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}