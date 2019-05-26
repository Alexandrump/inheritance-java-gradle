package com.brujulaitexercise.figures.Model;

public class Parallelogram extends Figure {

    public static final String NAME = "Parallelogram";

    Parallelogram() {
    }

    /**
     * Named Constructor
     * @return Parallelogram
     */
    static Parallelogram create() {
        return new Parallelogram();
    }

    /**
     * @return Render name
     */
    @Override
    public String render() {
        return NAME + " (identifier: " + super.getUuid() + ")";
    }

}
