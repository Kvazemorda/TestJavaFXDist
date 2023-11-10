module pro.techwave.optisystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens pro.techwave.optisystem to javafx.fxml;
    exports pro.techwave.optisystem;
}