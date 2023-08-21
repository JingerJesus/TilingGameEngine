package com.github.jingerjesus.tilinggameenginetwodee.engine;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import com.github.jingerjesus.tilinggameenginetwodee.Game;
import javafx.stage.WindowEvent;
import javafx.util.Duration;

import java.io.IOException;

public class Driver extends Application {

    private static Stage mainStage;
    private static Room currentRoom;
    private static int windowWidth = 1024, windowHeight = 768;
    private static int framerate = 35;
    private static String windowTitle = "Unnamed Room";
    @Override
    public void start(Stage stage) {

        Game.configureWindow();
        mainStage = stage;
        stage.setWidth(windowWidth);
        stage.setHeight(windowHeight);
        stage.setTitle(windowTitle);

        Game.onGameStart();

        mainStage.setScene(currentRoom.getMainScene());

        //closing out the game
        mainStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent e) {
                gameLoop.stop();
                Platform.exit();
                System.exit(0);
            }
        });

        mainStage.show();

        gameLoop.setCycleCount(Animation.INDEFINITE);
        gameLoop.play();


    }

    KeyFrame animate = new KeyFrame(

            //Common FPS Values:
            //120 FPS: 0.0083 sec
            //60 FPS: 0.0167 sec
            //35 FPS: 0.029 sec
            //25 FPS: 0.04 sec
            //1 FPS: 1.0 sec
            Duration.seconds(1.0 / framerate),
            actionEvent -> {
                currentRoom.onUpdate();
                Game.onUpdate();
                mainStage.show();
            }
    );

    Timeline gameLoop = new Timeline(animate);




    public static void main(String[] args) {
        launch();
    }


    public static void setWindowWidth(int width) {windowWidth = width;}
    public static void setWindowHeight(int height) {windowHeight = height;}
    public static void setFramerate(int rate) {framerate = rate;}
    public static void setWindowTitle(String title) {windowTitle = title;}
    public static void setCurrentRoom(Room r) {currentRoom = r;}
}