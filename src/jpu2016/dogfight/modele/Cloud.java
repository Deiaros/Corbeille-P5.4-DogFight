package jpu2016.dogfight.modele;

public class Cloud extends Mobile{

    private int SPEED = 4;
    private int WIDTH = 100;
    private int HEIGHT = 10;
    private String IMAGE = "cloud";

    public Cloud(Direction direction, Dimension dimension) {
        super(direction, position, null, player, image);
    }

}