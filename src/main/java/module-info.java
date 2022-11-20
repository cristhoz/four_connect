module dev.delahoz.four_connect {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.commons.configuration2;
    requires lombok;
    requires java.sql;


    exports dev.delahoz.four_connect;
    opens dev.delahoz.four_connect to javafx.fxml;
    exports dev.delahoz.four_connect.controllers;
    opens dev.delahoz.four_connect.controllers to javafx.fxml;
}