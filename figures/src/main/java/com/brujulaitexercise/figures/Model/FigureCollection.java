package com.brujulaitexercise.figures.Model;

import java.util.ArrayList;
import java.util.List;

public class FigureCollection {

    private List<Figure> figures;

    private FigureCollection() {
    }

    /**
     * Named Constructor
     * @return Figure Collection
     */
    public static FigureCollection instance() {
        FigureCollection figureCollection = new FigureCollection();
        figureCollection.figures = inititializateDefaultFigureCollection();
        return figureCollection;
    }

    /**
     * @return Default Initialized Figures
     */
    private static List<Figure> inititializateDefaultFigureCollection() {
        List<Figure> figureCollection = new ArrayList<>();
        figureCollection.add(Triangle.create());
        figureCollection.add(Square.create());
        figureCollection.add(Triangle.create());
        figureCollection.add(Square.create());
        figureCollection.add(Rhomb.create());

        return figureCollection;
    }

    /**
     * @return List of Figures
     */
    public List<Figure> getFigures() {
        return figures;
    }
}
