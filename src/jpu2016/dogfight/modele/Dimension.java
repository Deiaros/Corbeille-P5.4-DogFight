package jpu2016.dogfight.modele;

public class Dimension {

    private int width;
    private int height;
    private int size; //Dimensions total area width multipled by height

    //The Dimmension method sets our height width and size
    public Dimension(int width, int height) {
        this.setSize(width, height);
        this.setWidth(width);
        this.setHeight(height);
    }

    //Secondary method of Dimension stat copying
    public Dimension(Dimension dimension) {
        this.setSize(dimension.size);
        this.setWidth(dimension.width);
        this.setHeight(dimension.height);
    }

    public void setSize(int width, int height) {
        this.size =  width * height;
    }

    public void setSize(int dimSize) {
        this.size =  dimSize;
    }

    public int getSize() {
        return this.size;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}