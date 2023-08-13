package com.github.jingerjesus.tilinggameenginetwodee.engine;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameObject {
    protected Sprite sprite;
    protected int x, y;
    public GameObject() {
        x = 0; y = 0;
        sprite = null;
    }
    public GameObject(int x, int y) {
        this.x = x; this.y = y;
        sprite = null;
    }

    public void setSprite(Sprite i) {
        sprite = i;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public int getX() {return x;}
    public int getY() {return y;}
}
