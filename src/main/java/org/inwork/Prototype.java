package org.inwork;

public abstract class Prototype {
    public int id;

    public Prototype(int id) {
        this.id = id;
    }
    public abstract Prototype clone();
}
