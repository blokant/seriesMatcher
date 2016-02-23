package org.smak;

public class Main {

    public static void main(String[] args) {

        SliceMatcher sliceMatcher = new SliceMatcher();
        System.out.println(sliceMatcher.getSeries(12000));
        Series series = new Series();
        System.out.println("first: " + series.getFirst());
        for(int i = 0; i < 60; i++){
            System.out.println(series.getNext());
        }

    }
}
