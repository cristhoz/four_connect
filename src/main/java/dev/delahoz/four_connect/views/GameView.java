package dev.delahoz.four_connect.views;

import dev.delahoz.four_connect.config.properties.Properties;
import dev.delahoz.four_connect.route.Router;
import dev.delahoz.four_connect.route.Routes;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class GameView extends Views {
    public GameView() {
        Properties properties = new Properties();

        Label label = new Label("GameView");
        Button button = new Button("GoTo Result");

        button.setOnAction((event) -> Router.setRoute(Routes.Result));

        VBox layout = new VBox();
        layout.getChildren().addAll(label, button);

        scene = new Scene(layout, properties.getScreenConfig().getViewSize().getWidth(), properties.getScreenConfig().getViewSize().getHeight());
    }
}
