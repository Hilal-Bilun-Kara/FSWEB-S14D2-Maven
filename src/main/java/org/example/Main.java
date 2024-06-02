package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Lamp lamp =  new Lamp(LampType.NORMAL,true,100);
        Ceiling ceiling = new Ceiling(4, PaintColor.RED);
        Bed bed = new Bed("double",5,5,5,5);
        Wall northWall = new Wall("North");
        Wall eastWall = new Wall("East");
        Wall westWall = new Wall("West");
        Wall[] walls = new Wall[]{northWall,eastWall,westWall};
        Wardrobe wardrobe = new Wardrobe(2,2,3.4);

        Bedroom bedroom = new Bedroom(northWall,eastWall,westWall,ceiling,new Carpet(5,5,PaintColor.WHITE),lamp,bed,wardrobe,"bedroom1");
        bedroom.createBedroom();
    }
}