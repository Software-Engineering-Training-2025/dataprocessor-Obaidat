package org.example.dataprocessor.clean;

import org.example.dataprocessor.enums.CleaningType;

import java.util.List;

public class Clean {

    public static CleanInterface cleaner(CleaningType cleaningType) {

        if (cleaningType == CleaningType.REMOVE_NEGATIVES) {
            return new RemoveNegatives();
        }
        else {
            return new ReplaceNegativesWithZeros();
        }
    }
}
