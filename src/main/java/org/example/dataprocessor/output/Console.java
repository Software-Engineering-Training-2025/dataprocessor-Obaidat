package org.example.dataprocessor.output;

public class Console implements OutputInterface{

    @Override
    public void print(Object object) {
        System.out.println(object);
    }
}
