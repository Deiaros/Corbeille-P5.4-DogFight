package jpu2016.dogfight.modele;

public class Position {

    private double x;
    private double y;
    private double maxX;
    private double maxY;

    //Sets a positon object with a coordinates for future reference
    public Position (double x, double y, double maxX, double maxY) {
        this.setMaxX(maxX);
        this.setMaxY(maxY);
        this.setX(x);
        this.setY(y);
    }

    //Allows the copying of other positions perameters
    public Position (Position position) {
        this.setMaxX(position.maxX);
        this.setMaxY(position.maxY);
        this.setX(position.x);
        this.setY(position.y);
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        // if(x <= maxX) This might be needed later
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        // if(y <= maxY) This might be needed later
        this.y = y;
    }
    
    protected void setMaxX(double maxX) {
        this.maxX = maxX;
    }

    protected void setMaxY(double maxY) {
        this.maxY = maxY;
    }
}