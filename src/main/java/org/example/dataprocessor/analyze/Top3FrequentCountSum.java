package org.example.dataprocessor.analyze;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top3FrequentCountSum implements AnalyzeInterface{
    @Override
    public Double analyze(List<Integer> list) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer item : list){
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int count = 0;
        Double answer = 0.0;
        for (Integer item : map.values()){
            answer += item;
            count++;
            if (count == 3){
                break;
            }
        }

        return answer;
    }
}
