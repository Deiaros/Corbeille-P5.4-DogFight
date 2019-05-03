package jpu2016.dogfight.modele;

public class Missle extends Mobile{

    private int SPEED = 4;
    private int WIDTH = 100;
    private int HEIGHT = 10;
    private int MAX_DISTANCE_TRAVELED = 1400;
    private String IMAGE = "missile";
    private int distanceTraveled = 0;
    
    public Missle(Direction direction, Dimension dimension) {
        super(direction, position, null, player, image);
    }

    public int getWidthWithADirection(Direction direction) {

    }

    public int getHeightWithADirection(Direction direction) {

    }

    public void move() {

    }

    public boolean isWeapon() {

    }

}