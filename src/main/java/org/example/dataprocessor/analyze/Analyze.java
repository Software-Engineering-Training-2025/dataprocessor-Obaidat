package org.example.dataprocessor.analyze;

import org.example.dataprocessor.enums.AnalysisType;

import java.util.List;

public class Analyze {

    public static AnalyzeInterface analyzer(AnalysisType analysisType) {

        if (analysisType == AnalysisType.MEAN){
            return new Mean();
        }
        else if (analysisType == AnalysisType.MEDIAN){
            return new Median();
        }
        else if (analysisType == AnalysisType.STD_DEV){
            return new StandardDeviation();
        }
        else if (analysisType == AnalysisType.VARIANCE){
            return new Variance();
        }
        else if (analysisType == AnalysisType.P90_NEAREST_RANK){
            return new P90();
        }
        else{
            return new Top3FrequentCountSum();
        }
    }
}
