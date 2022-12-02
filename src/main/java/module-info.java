module com.example.icantdoit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.icantdoit to javafx.fxml;
    exports com.example.icantdoit;
}