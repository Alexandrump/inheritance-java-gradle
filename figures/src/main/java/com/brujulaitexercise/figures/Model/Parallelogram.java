package com.brujulaitexercise.figures.Model;

public class Parallelogram extends Figure {

    public static final String NAME = "Parallelogram";

    Parallelogram() {
    }

    static Parallelogram create() {
        return new Parallelogram();
    }

    @Override
    public String render() {
        return NAME + " (identifier: " + super.getUuid() + ")";
    }

}
