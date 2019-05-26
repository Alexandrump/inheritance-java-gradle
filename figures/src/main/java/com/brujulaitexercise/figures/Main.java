package com.brujulaitexercise.figures;

import com.brujulaitexercise.figures.Model.Figure;
import com.brujulaitexercise.figures.Model.FigureCollection;
import com.brujulaitexercise.figures.Model.Parallelogram;
import com.brujulaitexercise.figures.Model.Triangle;
import com.brujulaitexercise.figures.Repository.FigureStackRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            renderSelectedFigures(
                    "List of Parallelograms:",
                    FigureStackRepository.create(FigureCollection.instance()
                            .getFigures())
                            .findByFigureType(Parallelogram.class)
            );

            renderSelectedFigures(
                    "List of Triangles:",
                    FigureStackRepository.create(FigureCollection.instance()
                            .getFigures())
                            .findByFigureType(Triangle.class)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void renderSelectedFigures(String header, List<Figure> figures) {
        System.out.println(header);
        for (Figure figure : figures) {
            System.out.println("- " + figure.render());
        }
        System.out.println();
    }

}
