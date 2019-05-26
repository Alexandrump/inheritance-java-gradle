package com.brujulaitexercise.figures.Model;

import java.util.UUID;

public abstract class Figure {

    public static final String NAME = "Figure";

    private UUID uuid = UUID.randomUUID();

    Figure() {
    }

    /**
     * @return Render name
     */
    public String render() {
        return NAME;
    }

    /**
     * @return Generated UUID
     */
    UUID getUuid() {
        return uuid;
    }
}
