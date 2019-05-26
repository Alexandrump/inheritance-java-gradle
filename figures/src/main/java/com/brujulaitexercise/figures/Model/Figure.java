package com.brujulaitexercise.figures.Model;

import java.util.UUID;

public abstract class Figure {

    public static final String NAME = "Figure";

    private UUID uuid = UUID.randomUUID();

    Figure() {
    }

    public String render() {
        return NAME;
    }

    UUID getUuid() {
        return uuid;
    }
}
