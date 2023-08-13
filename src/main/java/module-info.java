module com.github.jingerjesus.tilinggameenginetwodee {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.github.jingerjesus.tilinggameenginetwodee.engine;
    opens com.github.jingerjesus.tilinggameenginetwodee.engine to javafx.fxml;
}