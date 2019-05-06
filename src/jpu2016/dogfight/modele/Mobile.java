package jpu2016.dogfight.modele;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

//import com.sun.java.util.jar.pack.Package.Class.Method;

public class Mobile implements IMobile {

    private int speed;
    private Direction direction; //declares the Direction enumeration as direction
    private String image;
    public Point point = new Point();
    public Dimension dim;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
        this.setDirection(direction);
        this.point.setLocation(position.getX(), position.getY());
        this.dim = dimension;
        this.speed = speed;
        this.image = image;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    //makes position useless oustside of temp storage (what the diagram asks for)
    public Point getPosition() {
        return this.point;
    }

    public Dimension getDimension() {
        return this.dim;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getWidth() {
        return this.WIDTH;
    }

    public int getHeight() {
        return this.HEIGHT;
    }

    //not sure what to do here yet
    public void placeInArea(IArea area) {
        
    }

    public boolean isPlayer(int player) {
        return false;
    }

    //Adds a number to either or both x or y coord
    public void move(int dx, int dy) {

        this.point.translate(dx, dy);
    }

    //checks direction and makes a single move depending on direction
    private void moveUp() {
        move(1,0);
        this.direction = Direction.UP;
    }

    private void moveRight() {
        move(0,1);
        this.direction = Direction.RIGHT;
    }

    private void moveDown() {
        move(-1,0);
        this.direction = Direction.DOWN;
    }

    private void moveLeft() {
        move(0,-1);
        this.direction = Direction.LEFT;
    }

    //not used as of yet
    public Color getColor() {
        return null;
    }

    //need to set thingone up
    public IDogfightModel getDogfightModel() {
        return null;//temp REMOVE ME
    }

    //same as above
    public void setDogfightModel(IDogfightModel dogfightModel) {

    }

    //what is hit supposed to do?
    public boolean hit() {
        return false;
    }

    //default of false
    public boolean isWeapon() {
        return false;
    }

    public Image getImage() {
        return this.image;
    }

}
