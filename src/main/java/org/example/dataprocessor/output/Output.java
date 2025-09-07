package org.example.dataprocessor.output;

import org.example.dataprocessor.enums.OutputType;

public class Output {

    public static OutputInterface printer(OutputType outputType) {

        if (outputType == OutputType.CONSOLE){
            return new Console();
        }
        else{
            return new TextFile();
        }
    }
}
