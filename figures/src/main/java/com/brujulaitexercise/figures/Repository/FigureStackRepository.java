package com.brujulaitexercise.figures.Repository;

import com.brujulaitexercise.figures.Model.Figure;

import java.util.List;

public class FigureStackRepository implements FigureRepositoryInterface {

    private List<Figure> figureCollection;

    private FigureStackRepository(List<Figure> figureCollection) {
        this.figureCollection = figureCollection;
    }
    /**
     * Named Constructor
     * @param figureCollection Given Figures
     * @return Figure Repository from stack
     */
    public static FigureStackRepository create(List<Figure> figureCollection) {
        return new FigureStackRepository(figureCollection);
    }

    /**
     * @param expectedFigure Expected Class Figure
     * @return Instanced Figure
     */
    public List<Figure> findByFigureType(Class<? extends Figure> expectedFigure) {
        figureCollection.removeIf(
                f -> !expectedFigure.isAssignableFrom(f.getClass())
        );
        return figureCollection;
    }
}
