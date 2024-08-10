module com.example.imageholder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imageholder to javafx.fxml;
    exports com.example.imageholder;
}