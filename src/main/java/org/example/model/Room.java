package org.example.model;

import java.util.Arrays;

public class Room {

    private Wall[] walls;

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;

    private Ceiling ceiling;
    private Carpet carpet;
    private Lamp lamp;

    public Room(Wall wall1, Wall wall2, Wall wall3, Ceiling ceiling, Carpet carpet, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.ceiling = ceiling;
        this.carpet = carpet;
        this.lamp = lamp;

    }

    public Room(Wall wall1, Wall wall2, Wall wall3, Ceiling ceiling, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.ceiling = ceiling;
        this.lamp = lamp;

    }

    public Wall[] getWalls() {
        return walls;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Lamp getLamp() {
        return lamp;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + Arrays.toString(walls) +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", ceiling=" + ceiling +
                ", carpet=" + carpet +
                ", lamp=" + lamp +
                '}';
    }
}
