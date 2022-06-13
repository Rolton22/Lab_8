package com.company.Classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parallelogram_List implements Serializable {

    private final List<Parallelogram> parallelograms;

    public List<Parallelogram> getList() {
        return parallelograms;
    }

    public  Parallelogram_List() {
        parallelograms = new ArrayList<>();
    }


    public void add(Parallelogram parallelogram) {
        parallelograms.add( parallelogram);
    }

    public void remove(Parallelogram  parallelogram) {
        parallelograms.remove( parallelogram);
    }

    public void remove(int number) {
        if (number < parallelograms.size()) parallelograms.remove(number);
    }

    public int getSize() {
        return this.parallelograms.size();
    }

    public int countOf(String type) {

        return getListOf(type).getSize();

    }

    public  Parallelogram_List getListOf(String type) {
        Parallelogram_List result = new  Parallelogram_List();

        for (Parallelogram item : parallelograms) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(type)) result.add(item);
        }

        return result;
    }

    public Parallelogram findParallelogram_List_MaxSquare() {

        Parallelogram   maxParallelogramArea =   parallelograms.get(0);
        for (Parallelogram  quadrilateral :   parallelograms) {
            if (quadrilateral.getSquare() > maxParallelogramArea.getSquare()) {
                maxParallelogramArea =quadrilateral;
            }

        }
        return maxParallelogramArea;
    }

    public Parallelogram findParallelogram_List_MinSquare() {
        Parallelogram minTriangleArea =  parallelograms.get(0);
        for (Parallelogram triangle :  parallelograms) {
            if (triangle.getSquare() < minTriangleArea.getSquare()) {
                minTriangleArea = triangle;
            }
        }
        return minTriangleArea;
    }

    @Override
    public String toString() {
        return "Parallelogram List{" + parallelograms + '}';
    }

}
