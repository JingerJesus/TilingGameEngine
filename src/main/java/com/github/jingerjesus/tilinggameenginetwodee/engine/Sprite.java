package com.github.jingerjesus.tilinggameenginetwodee.engine;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Sprite {
    private Image[] images;
    private ImageView view;
    private double animationTiming;
    private int w, h;

    public Sprite() {
        images = new Image[1];
        images[0] = new Image("src/main/java/com/github/jingerjesus/tilinggameenginetwodee/engine/defaultassets/default.png");
        animationTiming = -1;
        w = (int)images[0].getWidth();
        h = (int)images[0].getHeight();
    }

    public Sprite(String pathFromSource) {
        images = new Image[1];
        images[0] = new Image(pathFromSource);
        animationTiming = -1;
        w = (int)images[0].getWidth();
        h = (int)images[0].getHeight();
    }

    public Sprite(String[] pathsFromSource, double frameRate) {
        images = new Image[pathsFromSource.length];
        for (int i = 0; i < images.length; i ++) {
            images[i] = new Image(pathsFromSource[i]);
            animationTiming = frameRate;
        }
    }

    public ImageView getDrawable() {return view;}
}
