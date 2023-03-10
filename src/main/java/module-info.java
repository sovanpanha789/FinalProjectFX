module com.example.finalprojectfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalprojectfx to javafx.fxml;
    exports com.example.finalprojectfx;
}