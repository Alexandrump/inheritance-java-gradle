package com.brujulaitexercise.figures.Model;

import java.util.ArrayList;
import java.util.List;

public class FigureCollection {

    private List<Figure> figures;

    private FigureCollection() {
    }

    public static FigureCollection instance() {
        FigureCollection figureCollection = new FigureCollection();
        figureCollection.figures = inititializateDefaultFigureCollection();
        return figureCollection;
    }

    private static List<Figure> inititializateDefaultFigureCollection() {
        List<Figure> figureCollection = new ArrayList<>();
        figureCollection.add(Triangle.create());
        figureCollection.add(Square.create());
        figureCollection.add(Triangle.create());
        figureCollection.add(Square.create());
        figureCollection.add(Rhomb.create());

        return figureCollection;
    }

    public List<Figure> getFigures() {
        return figures;
    }
}
