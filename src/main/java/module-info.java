module uz.bakhromjon.javafxradiobutton {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxradiobutton to javafx.fxml;
    exports uz.bakhromjon.javafxradiobutton;
}