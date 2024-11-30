module com.example.employeemanagment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.employeemanagment to javafx.fxml;
    exports com.example.employeemanagment;
}