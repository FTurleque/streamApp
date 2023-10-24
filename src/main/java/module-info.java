module com.streamapp {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens com.streamapp to javafx.fxml;
    exports com.streamapp;
}