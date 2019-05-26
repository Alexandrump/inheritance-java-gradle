package com.brujulaitexercise.figures.Model;

public class Triangle extends Figure {

    public static final String NAME = "Triangle";

    Triangle() {
    }

    /**
     * Named Constructor
     * @return Triangle
     */
    static Triangle create() {
        return new Triangle();
    }

    /**
     * @return Render name
     */
    @Override
    public String render() {

        return NAME + " (identifier: " + super.getUuid() + ")";
    }

}