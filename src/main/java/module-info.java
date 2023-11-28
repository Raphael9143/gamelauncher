module com.example.gamelauncher {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.gamelauncher to javafx.fxml;
    exports com.example.gamelauncher;
}