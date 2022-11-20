package dev.delahoz.four_connect.route;

import dev.delahoz.four_connect.views.GameView;
import dev.delahoz.four_connect.views.HomeView;
import dev.delahoz.four_connect.views.ResultView;
import dev.delahoz.four_connect.views.Views;
import javafx.stage.Stage;

public class Router {
    private static Stage stage;
    private static final Views homeView = new HomeView();
    private static final Views gameView = new GameView();
    private static final Views resultView = new ResultView();

    public static void setStage(Stage inputStage) {
        stage = inputStage;
    }

    public static void setRoute(Routes route) {
        switch (route) {
            case Home -> stage.setScene(homeView.getScene());
            case Game -> stage.setScene(gameView.getScene());
            case Result -> stage.setScene(resultView.getScene());
        }
    }
}
