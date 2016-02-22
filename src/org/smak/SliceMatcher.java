package org.smak;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smak on 22.02.16.
 */
public class SliceMatcher {
    private final int sliceLength;
    private Map<Integer, String> data;
    public String getSeries(int number){
        return data.get(number);
    }
    public void setForSlice(int left, int right, String series){
        for (int i = left; i < right; i++) {
            data.put(i,series);
        }
    }
    public SliceMatcher(){
        sliceLength = 1000;
        data = new HashMap<Integer, String>();
        for (int i = 0; i < sliceLength; i++) {
            data.put(i,"AA");
            data.put(i+sliceLength,"AB");
            data.put(i+sliceLength*2,"AC");
        }
    }
}
