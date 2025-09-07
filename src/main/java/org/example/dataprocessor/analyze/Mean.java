package org.example.dataprocessor.analyze;

import java.util.List;

public class Mean implements AnalyzeInterface{
    @Override
    public Double analyze(List<Integer> list) {

        Double sum = 0.0;
        for (Integer item : list) {
            sum += item;
        }
        return sum / list.size();
    }
}
