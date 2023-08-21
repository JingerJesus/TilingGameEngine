package com.github.jingerjesus.tilinggameenginetwodee.engine;

public class Tile extends GameObject {
    protected int r; //radius of tile - treated as side length in square tiles

    public Tile() {
        super();
        r = 20;
    }
    public Tile(int x, int y, int r) {
        super(x,y); this.r = r;
    }
    
    public int getRadius() {return r;}

}
