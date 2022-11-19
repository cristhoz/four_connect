module dev.delahoz.four_connect {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.delahoz.four_connect to javafx.fxml;
    exports dev.delahoz.four_connect;
}