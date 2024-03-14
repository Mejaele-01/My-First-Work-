module com.example.work1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.work1 to javafx.fxml;
    exports com.example.work1;
}