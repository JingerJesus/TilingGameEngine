package com.github.jingerjesus.tilinggameenginetwodee.engine;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sprite {
    private Image[] images;
    private Image currentImage;
    private ImageView view;
    private double animationTiming; // in game frames per frame (a value of 2 and a game framerate of 30 means the actual animation framerate will be 15 fps.)
    private int w, h, x, y;

    public Sprite() {
        try {
            currentImage = new Image(new FileInputStream("src/main/java/com/github/jingerjesus/tilinggameenginetwodee/engine/defaultassets/default.png"));
        } catch (Exception e) {}
        animationTiming = -1;
        w = (int)currentImage.getWidth();
        h = (int)currentImage.getHeight();
        x = 0; y = 0;
        view = new ImageView();
        view.setImage(currentImage);
    }

    public Sprite(int x, int y) {
        this.x = x; this.y = y;
        try {
            currentImage = new Image(new FileInputStream("src/main/java/com/github/jingerjesus/tilinggameenginetwodee/engine/defaultassets/default.png"));
        } catch (Exception e) {}
        animationTiming = -1;
        w = (int)currentImage.getWidth();
        h = (int)currentImage.getHeight();
        view = new ImageView();
        view.setImage(currentImage);
    }

    public Sprite(String pathFromSource) {
        try {
            currentImage = new Image(new FileInputStream(pathFromSource));
        } catch (Exception e) {}
        animationTiming = -1;
        w = (int)currentImage.getWidth();
        h = (int)currentImage.getHeight();
        x = 0; y = 0;
        view = new ImageView();
        view.setImage(currentImage);
    }

    public Sprite(String[] pathsFromSource, double frameRate) {
        images = new Image[pathsFromSource.length];
        animationTiming = frameRate;
        for (int i = 0; i < images.length; i++) {
            images[i] = new Image(pathsFromSource[i]);
        }
        currentImage = images[0];
        x = 0; y = 0;
    }

    public ImageView getDrawable() {
        return view;
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public int getW() {return w;}
    public int getH() {return h;}

    public void setX(int i) {
        x = i;
        view.setX(i);

    }
    public void setY(int i) {
        y = i;
        view.setY(i);
    }
    public void setW(int i) {
        w = i;
        view.setFitWidth(i);
    }
    public void setH(int i) {
        h = i;
        view.setFitHeight(i);
    }
}
