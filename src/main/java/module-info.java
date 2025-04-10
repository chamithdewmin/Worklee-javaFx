module com.worklee.worklee {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires font.awesome;


    opens com.worklee.worklee to javafx.fxml;
    exports com.worklee.worklee;
    exports com.worklee.worklee.Controllers;
    exports com.worklee.worklee.Models;
    exports com.worklee.worklee.Views;
    
}