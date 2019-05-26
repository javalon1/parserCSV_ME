package com.sda.algorytmy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Path file = Paths.get("real_estate.csv");

    public static void main(String[] args)
    { try {

        List<String> lines = Files.readAllLines(file);
        System.out.println(lines);
    }catch(IOException e){
        e.printStackTrace();
    }
    }
}

