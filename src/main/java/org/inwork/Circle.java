package org.inwork;

public class Circle implements IFigure{
    int radius;

    public Circle(int r) {
        radius = r;
    }

    @Override
    public IFigure clone() {
        return new Circle(this.radius);
    }

    @Override
    public void getInfo() {
        System.out.printf("Круг радиусом %d\n", radius);

    }
}
