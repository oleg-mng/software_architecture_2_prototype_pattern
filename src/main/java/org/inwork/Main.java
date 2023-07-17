package org.inwork;

public class Main {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype1(1);
        Prototype clone = prototype.clone();
        System.out.println(clone.getClass());
        prototype = new ConcretePrototype2(2);
        clone = prototype.clone();
        System.out.println(clone.getClass());
        System.out.println();


        IFigure iFigure = new Rectangle(30, 40);
        IFigure clonedFigure = iFigure.clone();
        iFigure.getInfo();
        clonedFigure.getInfo();

        iFigure = new Circle(10);
        clonedFigure = iFigure.clone();
        iFigure.getInfo();
        clonedFigure.getInfo();

    }
}

