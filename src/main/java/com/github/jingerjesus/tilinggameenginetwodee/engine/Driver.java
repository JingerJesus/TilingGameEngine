package com.github.jingerjesus.tilinggameenginetwodee.engine;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Driver extends Application {

    private static Stage mainStage;
    private static Room currentRoom;
    private static int windowWidth, windowHeight;
    private static String windowTitle;
    @Override
    public void start(Stage stage) throws IOException {
        config();

        currentRoom = new Room();

        mainStage = stage;
        stage.setWidth(windowWidth);
        stage.setHeight(windowHeight);
        stage.setTitle(windowTitle);
        mainStage.setScene(currentRoom.getMainScene());

        mainStage.show();


    }

    public static void main(String[] args) {
        launch();
    }

    public void config() {
        windowWidth = 1024;
        windowHeight = 768;
        windowTitle = "Test Window";
    }
}