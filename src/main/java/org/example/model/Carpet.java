package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public Carpet(int height,  int width,PaintColor color) {
        this.height = height;
        this.color = color;
        this.width = width;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }
}
