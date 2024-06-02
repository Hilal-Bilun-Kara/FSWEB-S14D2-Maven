package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style, int height, int pillows, int sheets, int quilts) {
        this.style = style;
        this.height = height;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getPillows(){
        return pillows;
    }
    public int getHeight(){
        return height;
    }
    public int getSheets(){
        return sheets;
    }
    public int getQuilts(){
        return quilts;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilts=" + quilts +
                '}';
    }
}