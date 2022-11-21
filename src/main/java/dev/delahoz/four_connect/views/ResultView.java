package dev.delahoz.four_connect.views;

import dev.delahoz.four_connect.config.properties.Properties;
import dev.delahoz.four_connect.route.Router;
import dev.delahoz.four_connect.route.Routes;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class ResultView extends Views {
    public ResultView() {
        Properties properties = new Properties();

        Label label = new Label("ResultView");
        Button buttonOne = new Button("GoTo Home");
        Button buttonTwo = new Button("GoTo Game");

        buttonOne.setOnAction((event) -> Router.setRoute(Routes.Home));
        buttonTwo.setOnAction((event) -> Router.setRoute(Routes.Game));

        VBox layout = new VBox();
        layout.getChildren().addAll(label, buttonOne, buttonTwo);

        scene = new Scene(layout, properties.getScreenConfig().getViewSize().getWidth(), properties.getScreenConfig().getViewSize().getHeight());
    }
}
