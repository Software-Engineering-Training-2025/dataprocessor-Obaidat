package org.example.dataprocessor.analyze;

import java.util.List;

public class P90 implements AnalyzeInterface {
    @Override
    public Double analyze(List<Integer> list) {
        return list.get((int)(Math.ceil(0.9 * list.size())-1)).doubleValue();
    }
}
