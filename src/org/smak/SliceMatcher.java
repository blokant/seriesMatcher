package org.smak;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smak on 22.02.16.
 */
public class SliceMatcher {
    private Map<Integer, String> data;
    public String getSeries(int number){
        return data.get(number);
    }
    public SliceMatcher(){
        data = new HashMap<Integer, String>();
        for (int i = 0; i < 1000; i++) {
            data.put(i,"AA");
            data.put(i+1000,"AB");
            data.put(i+2000,"AC");
        }
    }
}
