package org.example.model;

public class Bedroom extends Room{
    private Bed bed;
    private Wardrobe wardrobe;
    private String name;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Ceiling ceiling, Carpet carpet, Lamp lamp, Bed bed, Wardrobe wardrobe, String name) {
        super(wall1, wall2, wall3, ceiling, carpet, lamp);
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.name = name;
    }

    public void createBedroom(){
        getWall1().create();
        getWall2().create();
        getWall3().create();
        getCeiling().create();
        bed.make();
        getCarpet().lying();
        wardrobe.add();
        getLamp().turnOn();

    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "bed=" + bed +
                ", room=" + super.toString() +
                ", wardrobe=" + wardrobe +
                ", name='" + name + '\'' +
                '}';
    }

}
