module com.example.latintoarabicnumeration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latintoarabicnumeration to javafx.fxml;
    exports com.example.latintoarabicnumeration;
}