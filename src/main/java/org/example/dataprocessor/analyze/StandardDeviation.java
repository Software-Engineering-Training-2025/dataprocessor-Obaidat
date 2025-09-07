package org.example.dataprocessor.analyze;

import java.util.List;

public class StandardDeviation implements AnalyzeInterface{
    @Override
    public Double analyze(List<Integer> list) {

        Variance variance = new Variance();
        return Math.sqrt(variance.analyze(list));
    }
}
