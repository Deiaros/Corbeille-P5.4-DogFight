package jpu2016.dogfight.modele;

public class Missle extends Mobile{

    private static int SPEED = 4;
    private static int WIDTH = 100;
    private static int HEIGHT = 10;
    private static int MAX_DISTANCE_TRAVELED = 1400;
    private static String IMAGE = "missile";
    private int distanceTraveled = 0;
    
    public Missle(Direction direction, Dimension dimension) {
        super(direction, null, dimension, SPEED, IMAGE);
    }

    public int getWidthWithADirection(Direction direction) {
        return 0;//temp REMOVE ME
    }

    public int getHeightWithADirection(Direction direction) {
        return 0;//temp REMOVE ME
    }

    public void move() {
        switch (this.getDirection()) {
            case UP:
                this.point.translate(1,0);
                break;
        
            case RIGHT:
                this.point.translate(0,1);
                break;
                
            case DOWN:
                this.point.translate(-1,0);
                break;

            case LEFT:
                this.point.translate(0,-1);
                break;

            default:
                break;
        }
    }

    public boolean isWeapon() {
        return true;
    }

}