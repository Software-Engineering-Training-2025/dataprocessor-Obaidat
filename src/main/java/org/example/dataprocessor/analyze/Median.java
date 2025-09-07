package org.example.dataprocessor.analyze;

import java.util.Collections;
import java.util.List;

public class Median implements AnalyzeInterface{
    @Override
    public Double analyze(List<Integer> list) {

        Collections.sort(list);
        return (list.size()&1) == 1 ? list.get(list.size()/2) :
                ((list.get(list.size()/2 - 1) + (list.get(list.size()/2))) / 2.0);
    }
}
