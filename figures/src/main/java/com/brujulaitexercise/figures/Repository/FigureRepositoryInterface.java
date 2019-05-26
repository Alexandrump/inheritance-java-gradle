package com.brujulaitexercise.figures.Repository;

import com.brujulaitexercise.figures.Model.Figure;

import java.util.List;

public interface FigureRepositoryInterface {

    List<Figure> findByFigureType(Class<? extends Figure> expectedFigure);
}
