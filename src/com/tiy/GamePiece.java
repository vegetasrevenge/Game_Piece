package com.tiy;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    //methods
    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;
    }
    //get methods
    public Integer getPositionX() {
        return positionX;
    }
    public Integer getPositionY() {
        return positionY;
    }
    public Boolean getFrozen() {
        return frozen;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    //set methods
    public void setName(String name) {
       this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //behavior methods

    public void move(int newPositionX, int newPositionY) {
        if (this.frozen == false) {
            this.positionX = newPositionX;
            this.positionY = newPositionY;
        }
    }

    public void freeze() {
        this.frozen = true;
    }

    public void unfreeze() {
        this.frozen = false;
    }
}
