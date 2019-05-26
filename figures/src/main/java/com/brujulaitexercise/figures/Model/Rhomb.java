package com.brujulaitexercise.figures.Model;

public class Rhomb extends Parallelogram {

    public static final String NAME = "Rhomb";

    private Rhomb() {
    }

    /**
     * Named Constructor
     * @return Rhomb
     */
    public static Rhomb create() {
        return new Rhomb();
    }

    /**
     * @return Render name
     */
    @Override
    public String render() {
        return NAME + " (identifier: " + super.getUuid() + ")";
    }

}