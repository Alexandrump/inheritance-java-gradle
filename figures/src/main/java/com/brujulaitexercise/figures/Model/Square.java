package com.brujulaitexercise.figures.Model;

public class Square extends Parallelogram {

    public static final String NAME = "Square";

    private Square() {
    }

    public static Square create() {
        return new Square();
    }

    @Override
    public String render() {
        return NAME + " (identifier: " + super.getUuid() + ")";
    }

}