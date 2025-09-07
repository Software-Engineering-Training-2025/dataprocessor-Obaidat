package org.example.dataprocessor.clean;

import java.util.List;

public class ReplaceNegativesWithZeros implements CleanInterface {
    @Override
    public List<Integer> clean(List<Integer> list) {
        return list.stream()
                .map(item -> item < 0 ? 0 : item)
                .toList();
    }
}
