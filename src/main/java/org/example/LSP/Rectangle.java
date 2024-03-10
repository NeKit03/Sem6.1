package org.example.LSP;

public class Rectangle extends QuadRangle {


    private int width;
    private int heith;

    public Rectangle(int width, int heith) {
        this.width = width;
        this.heith = heith;
    }

    @Override
    public int area() {
        return heith*width;
    }
}
