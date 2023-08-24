module com.github.jingerjesus.tilinggameenginetwodee {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.github.jingerjesus.tilinggameenginetwodee.engine;
    opens com.github.jingerjesus.tilinggameenginetwodee.engine to javafx.fxml;
    exports com.github.jingerjesus.tilinggameenginetwodee;
    opens com.github.jingerjesus.tilinggameenginetwodee to javafx.fxml;
    exports com.github.jingerjesus.tilinggameenginetwodee.engine.keyboard;
    opens com.github.jingerjesus.tilinggameenginetwodee.engine.keyboard to javafx.fxml;
}