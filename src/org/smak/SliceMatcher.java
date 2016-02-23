package org.smak;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smak on 22.02.16.
 */
public class SliceMatcher {
    private final int sliceLength; // when length reached new series begin
    public String getSeries(int number){
        Series s = new Series();
        String result = s.getFirst();
        for (int i = sliceLength; i < number; i+=sliceLength){
            result = s.getNext();
        }
        return result;
    }

    public SliceMatcher(){
        sliceLength = 1000;
    }
}
