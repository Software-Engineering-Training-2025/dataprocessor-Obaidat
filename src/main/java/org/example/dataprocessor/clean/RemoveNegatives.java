package org.example.dataprocessor.clean;

import java.util.List;

public class RemoveNegatives implements CleanInterface {

    @Override
    public List<Integer> clean(List<Integer> list) {
        return list.stream()
                .filter(item -> item > 0)
                .toList();
    }
}
