package com.brujulaitexercise.figures.Repository;

import com.brujulaitexercise.figures.Model.Figure;

import java.util.List;

public interface FigureRepositoryInterface {

    /**
     * @param expectedFigure Expected Class Figure
     * @return Instanced Figure
     */
    List<Figure> findByFigureType(Class<? extends Figure> expectedFigure);
}
