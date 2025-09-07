package org.example.dataprocessor.analyze;

import java.util.List;

public class Variance implements AnalyzeInterface{
    @Override
    public Double analyze(List<Integer> list) {

        Mean mean = new Mean();
        Double meanValue = mean.analyze(list);

        Double sum = 0.0;
        for (Integer item : list) {
            sum += Math.pow(item - meanValue, 2);
        }
        return sum / list.size();
    }
}
