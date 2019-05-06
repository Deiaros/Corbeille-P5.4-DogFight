package jpu2016.dogfight.modele;

import java.awt.List;
import java.util.ArrayList;

public class DogfightModel implements IDogfightModel {

    public Sky levelone;
    public List<Mobile> Plane = new ArrayList<Plane>();

    public DogfightModel() {

    }

    public IArea getArea() {
        return levelone.getDimension();//temp REMOVE ME
    }

    public void buildArea(Dimension dimension) {
        this.levelone = new Sky(dimension);
        //called by the controller to help build the game with Sky
    }

    public void addMobile(IMobile mobile) {
        Mobile plane1 = new Plane(1, UP, new Position(0, 0, 100, 100), "test1");
        Mobile plane2 = new Plane(1, UP, new Position(0, 0, 100, 100), "test2");
       // Mobile test = new Mobile Plane(Imobile.get, direction, position, image)
    }

    public void removeMobile(IMobile mobile) {
        plane1 = null;
        plane2 = null;
    }

    
    public ArrayList<IMobile> getMobiles() {
        return null;//temp REMOVE ME
    }

    public IMobile getMobileByPlayer(int player) {
        return null;//temp REMOVE ME
    }
    

    public void setMobilesHavesMoved() {

    }
}

