package jpu2016.dogfight.modele;

import java.awt.Color;
import java.awt.Image;

public class Sky implements IArea {

    public Sky(Dimension dimension) {
        Dimension Sky = new Dimension(dimension);
    }

    public Dimension getDimension() {
        return this.Sky;
    }

    //unsure how this should work
    public Image getImage() {
        return null;//insert image here
    }
}