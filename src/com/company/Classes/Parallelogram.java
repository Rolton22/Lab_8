package com.company.Classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parallelogram extends Quadrilateral implements Serializable {

    public Parallelogram() {
    }

    public Parallelogram(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);

    }

    boolean is_parallelogram() {
        double threshold = 0.00001;
        return Math.abs(getLengthA() - getLengthC()) < threshold && Math.abs(getLengthC() - getLengthD()) < threshold;
    }

    @Override
    public String toString() {
        return "Parallelogram" + super.toString();
    }


}
