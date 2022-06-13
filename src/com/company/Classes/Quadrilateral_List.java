package com.company.Classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quadrilateral_List implements Serializable {

    private final List<Quadrilateral> quadrilaterals;

    public List<Quadrilateral> getList() {
        return quadrilaterals;
    }

    public Quadrilateral_List() {
        quadrilaterals = new ArrayList<>();
    }


    public void add(Quadrilateral quadrilateral) {
        quadrilaterals.add(quadrilateral);
    }

    public void remove(Quadrilateral quadrilateral) {
        quadrilaterals.remove(quadrilateral);
    }

    public void remove(int number) {
        if (number < quadrilaterals.size()) quadrilaterals.remove(number);
    }

    public int getSize() {
        return this.quadrilaterals.size();
    }

    public int countOf(String type) {

        return getListOf(type).getSize();

    }

    public Quadrilateral_List getListOf(String type) {
        Quadrilateral_List result = new Quadrilateral_List();

        for (Quadrilateral item : quadrilaterals) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(type)) result.add(item);
        }

        return result;
    }

    public double findAverageArea() {

        double averageSquare = 0;
        for (int i = 0; i < quadrilaterals.size()-1; i++) {
            averageSquare = quadrilaterals.get(i).getSquare() + quadrilaterals.get(i + 1).getSquare();
        }
        return averageSquare / quadrilaterals.size();

    }


    @Override
    public String toString() {
        return "Quadrilateral List{" + quadrilaterals + '}';
    }

}
