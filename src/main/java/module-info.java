module com.streamapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.jfoenix;
    requires org.apache.logging.log4j;
    requires java.desktop;
    requires java.logging;

    opens com.streamapp to javafx.fxml;
    exports com.streamapp;
    exports com.streamapp.controllers.ihmControls;
    opens com.streamapp.controllers.ihmControls to javafx.fxml;
}