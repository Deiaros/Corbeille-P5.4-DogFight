package jpu2016.dogfight.modele;

import java.util.ArrayList;

public class DogfightModel implements IDogfightModel {

    public DogfightModel() {

    }

    public IArea getArea() {
        return null;//temp REMOVE ME
    }

    public void buildArea(Dimension dimension) {
        //called by the controller to help build the game with Sky
    }

    public void addMobile(IMobile mobile) {
        
    }

    public void removeMobile(IMobile mobile) {

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

