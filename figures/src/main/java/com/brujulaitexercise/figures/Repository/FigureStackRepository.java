package com.brujulaitexercise.figures.Repository;

import com.brujulaitexercise.figures.Model.Figure;

import java.util.List;

public class FigureStackRepository implements FigureRepositoryInterface {

    private List<Figure> figureCollection;

    private FigureStackRepository(List<Figure> figureCollection) {
        this.figureCollection = figureCollection;
    }

    public static FigureStackRepository create(List<Figure> figureCollection) {
        return new FigureStackRepository(figureCollection);
    }

    public List<Figure> findByFigureType(Class<? extends Figure> expectedFigure) {
        figureCollection.removeIf(
                f -> !expectedFigure.isAssignableFrom(f.getClass())
        );
        return figureCollection;
    }
}
