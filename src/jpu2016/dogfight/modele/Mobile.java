package jpu2016.dogfight.modele;

import java.awt.Color;
import java.awt.Point;
import java.awt.Image;

//import com.sun.java.util.jar.pack.Package.Class.Method;

public class Mobile implements IMobile {

    private int speed;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {

    }

    public Direction getDirection() {
        return null;//temp REMOVE ME
    }

    public void setDirection(Direction direction) {

    }

    public Point getPosition() {
        return null;//temp REMOVE ME
    }

    public Dimension getDimension() {
        return null;//temp REMOVE ME
    }

    public int getSpeed() {
        return 0;//temp REMOVE ME
    }

    public int getWidth() {
        return 0;//temp REMOVE ME
    }

    public int getHeight() {
        return 0;//temp REMOVE ME
    }

    public void move() {
        
    }

    public void placeInArea(IArea area) {

    }

    public boolean isPlayer(int player) {
        return true;//temp REMOVE ME
    }

    private void moveUp() {

    }

    private void moveRight() {
        
    }

    private void moveDown() {
        
    }

    private void moveLeft() {
        
    }

    public Color getColor() {
        return null;//temp REMOVE ME
    }

    public IDogfightModel getDogfightModel() {
        return null;//temp REMOVE ME
    }

    public void setDogfightModel(IDogfightModel dogfightModel) {

    }

    public boolean hit() {
        return true;//temp REMOVE ME
    }

    public boolean isWeapon() {
        return true;//temp REMOVE ME
    }

    public Image getImage() {
        return null;//temp REMOVE ME
    }

}
