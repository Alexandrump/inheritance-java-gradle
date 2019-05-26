package com.brujulaitexercise.figures.Model;

public class Rhomb extends Parallelogram {

    public static final String NAME = "Rhomb";

    private Rhomb() {
    }

    public static Rhomb create() {
        return new Rhomb();
    }

    @Override
    public String render() {
        return NAME + " (identifier: " + super.getUuid() + ")";
    }

}