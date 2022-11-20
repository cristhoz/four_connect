package dev.delahoz.four_connect.views;

import dev.delahoz.four_connect.config.properties.Properties;
import dev.delahoz.four_connect.route.Router;
import dev.delahoz.four_connect.route.Routes;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HomeView implements Views {
    private final Scene scene;

    public HomeView() {
        Properties properties = new Properties();

        Label label = new Label("ResultView");
        Button button = new Button("Go To Game");

        button.setOnAction((event) -> Router.setRoute(Routes.Game));

        VBox layout = new VBox();
        layout.getChildren().addAll(label, button);

        scene = new Scene(layout, properties.getScreenConfig().getViewSize().getWidth(), properties.getScreenConfig().getViewSize().getHeight());
    }

    public Scene getScene() {
        return scene;
    }
}
