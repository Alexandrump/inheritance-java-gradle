package com.brujulaitexercise.figures.Model;

public class Triangle extends Figure {

    public static final String NAME = "Triangle";

    Triangle() {
    }


    static Triangle create() {
        return new Triangle();
    }

    @Override
    public String render() {

        return NAME + " (identifier: " + super.getUuid() + ")";
    }

}