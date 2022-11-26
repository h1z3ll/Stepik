package Buildings;

import Buildings.Building;
import Buildings.SocialHouse;

public class HighRiseBuilding extends Building implements SocialHouse {
    protected int floors;
    protected String material;
    protected boolean undergroundParking;
    public HighRiseBuilding(){}

    public void setFloors(int i){
        this.floors = i;
    }

    public void getFloors(){
        System.out.println("There are " + this.floors + " floors");
    }

    public void setMaterial(String str){
        this.material = str;
    }

    public void getMaterial(){
        System.out.println("This building is made of " + this.material);
    }

    public void setUndergroundParking(boolean b){
        this.undergroundParking = b;
    }

    public void getUndergroundParking(){
        if (this.undergroundParking){
            System.out.println("There is underground parking");
        } else {
            System.out.println("There isn't underground parking");
        }
    }
    @Override
    public void print() {
        System.out.println(
            "My name is " + this.name + ", address: " + this.address + ", i was built in " + this.whenBuilt +
                ", I am a sight seeing " + this.isItSightSeeing + ", there are " + this.floors + " floors, I am made of " +
            this.material + ", I have underground parking: " + this.undergroundParking);
    }
    public void setVisitors(int i){
        this.visitors = i;
    }

    @Override
    public void howManyVisitors(){
        System.out.println("High rise building is visited by " + this.visitors + " visitors");
    }
}
