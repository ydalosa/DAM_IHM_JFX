module com.example.dam_ihm_jfx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.dam_ihm_jfx to javafx.fxml;
    exports com.example.dam_ihm_jfx;
}