module com.worklee.worklee {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.worklee.worklee to javafx.fxml;
    exports com.worklee.worklee;
}