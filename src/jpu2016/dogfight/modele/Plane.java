package jpu2016.dogfight.modele;

public class Plane extends Mobile{

    private int SPEED = 2;
    private int WIDTH = 100;
    private int HEIGHT = 30;
    private int player;
    
    public Plane(int player, Direction direction, Position position, String image) {
        super(direction, position, null, player, image);
    }

    public boolean isPlayer(int player) {

    }

    public boolean hit() {

    }

}