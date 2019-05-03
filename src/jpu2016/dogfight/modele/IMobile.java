package jpu2016.dogfight.modele;

import java.awt.Image;
import java.awt.Point;

interface IMobile {
    public Direction getDirection();
    public void setDirection(Direction direction);
    public Point getPosition();
    public Dimension getDimension();
    public int getSpeed();
    public int getWidth();
    public int getHeight();
    public void move();
    public void placeInArea(IArea area);
    public boolean isPlayer(int player);
    public void setDogfightModel(IDogfightModel dogfightModel);
    public boolean hit();
    public boolean isWeapon();
    public Image getImage();
}