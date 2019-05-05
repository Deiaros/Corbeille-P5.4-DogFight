package jpu2016.dogfight.modele;

import java.util.ArrayList;

interface IDogfightModel {

    public IArea getArea();
    public void buildArea(Dimension dimension);
    public void addMobile(IMobile mobile);
    public void removeMobile(IMobile mobile);
    public ArrayList<IMobile> getMobiles();
    public IMobile getMobileByPlayer(int player);
    public void setMobilesHavesMoved();
}
