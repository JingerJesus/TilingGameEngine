package com.github.jingerjesus.tilinggameenginetwodee;


import com.github.jingerjesus.tilinggameenginetwodee.engine.Driver;
import com.github.jingerjesus.tilinggameenginetwodee.engine.GameObject;
import com.github.jingerjesus.tilinggameenginetwodee.engine.Room;
import com.github.jingerjesus.tilinggameenginetwodee.engine.Sprite;

public class Game {
    // Declare your game-wide constants here.
    // Ignore tradition and just declare them here. This is a static class, so you won't use a constructor.
    //private static int constant = 100;
    private static Room titleRoom = new Room();
    private static GameObject object;

    //Don't do this looool
    private Game() {}

    // BE CAREFUL. DON'T DELETE OR CHANGE THE configureWindow() OR onGameStart() METHOD NAMES. BAD THINGS HAPPEN. KTHXBAI.
    public static void configureWindow() {
        // The Driver class, where all the fun stuff happens, needs the window size, framerate, and window name.
        // Driver.setWindowWidth(1024);
        // Driver.setWindowHeight(768);
        // Driver.setFramerate(35);
        Driver.setWindowTitle("Deez Nuts");
    }

    public static void onGameStart() {
        // First thing you need to do is make a Room and set the Driver's current room to that room. Otherwise, sad.
        // e.g.: Driver.setCurrentRoom(new Room());
        Driver.setCurrentRoom(titleRoom);

        object = new GameObject(
                new Sprite()
        );
        object.setX(512);
        object.setY(768/2);

        titleRoom.addObject(object);
    }

    public static void onUpdate() {
        //Here goes some stuff if you need it. Idk. Maybe it's useful.
    }

}
