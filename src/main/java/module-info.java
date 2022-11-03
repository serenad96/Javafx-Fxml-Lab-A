module com.mycompany.fmlexamplea {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.fmlexamplea to javafx.fxml;
    exports com.mycompany.fmlexamplea;
}
