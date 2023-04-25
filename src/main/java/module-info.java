module com.example.advancedcolorchooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.advancedcolorchooser to javafx.fxml;
    exports com.example.advancedcolorchooser;
}