package com.github.jingerjesus.tilinggameenginetwodee.engine;

import javafx.scene.Group;
import javafx.scene.Scene;

import java.util.ArrayList;

public class Room {
    private Scene mainScene;
    private Group roomGroup;
    private ArrayList<GameObject> objects;

    public Room() {
        roomGroup = new Group();
        mainScene = new Scene(roomGroup);
        objects = new ArrayList<GameObject>();
    }

    public Room(GameObject[] gameObjects) {
        roomGroup = new Group();
        mainScene = new Scene(roomGroup);
        objects = new ArrayList<GameObject>();
        for (int i = 0; i < gameObjects.length; i ++) {
            objects.add(gameObjects[i]);
            try {
                roomGroup.getChildren().add(gameObjects[i].getSprite().getDrawable());
            } catch (NullPointerException e) {
                return;
            } catch (Exception e) {
                return;
            }
        }
    }

    public Scene getMainScene() {return mainScene;}
}
