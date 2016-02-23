package org.smak;

public class Main {

    public static void main(String[] args) {

        SliceMatcher sliceMatcher = new SliceMatcher();
        for(int i = 0; i < 10; i ++){
            System.out.println("number: " + String.valueOf(i*1000) + "  Series: " + sliceMatcher.getSeries(i*1000));
        }
       // Series series = new Series();
       // System.out.println("first: " + series.getFirst());
       /* for(int i = 0; i < 60; i++){
            System.out.println(series.getNext());
        }*/

    }
}
