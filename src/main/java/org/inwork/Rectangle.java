package org.inwork;

public class Rectangle implements IFigure{
    int width;
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public IFigure clone() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public void getInfo() {
        System.out.printf("Прямоугольник шириной %d и высотой %d\n", width, height);

    }
}
