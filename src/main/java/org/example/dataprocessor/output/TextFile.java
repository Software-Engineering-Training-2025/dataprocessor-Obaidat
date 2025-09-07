package org.example.dataprocessor.output;

import java.io.*;

public class TextFile implements OutputInterface{
    @Override
    public void print(Object object) {

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("TextFile.txt"));
            writer.println(object);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
