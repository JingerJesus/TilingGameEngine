package com.github.jingerjesus.tilinggameenginetwodee.engine;

import com.github.jingerjesus.tilinggameenginetwodee.Game;
import javafx.scene.Group;
import javafx.scene.Scene;

import java.util.ArrayList;

public class Room {
    private Scene mainScene;
    private Group roomGroup;
    private ArrayList<GameObject> objects;
    private Sprite background;

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

    public void onCreate() {
        //do something with the background
        for (GameObject obj : objects) {
            //
        }
    }

    public void onUpdate() {

    }

    public void setBackground(Sprite s) {
        background = s;
        roomGroup.getChildren().add(background.getDrawable());
    }

    public void addObject(GameObject obj) {
        objects.add(obj);
        roomGroup.getChildren().add(obj.getSprite().getDrawable());
    }

    public Scene getMainScene() {return mainScene;}
}
