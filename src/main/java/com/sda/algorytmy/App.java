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
        byte[] lines2 = Files.readAllBytes(file);


        List<String> lines = Files.readAllLines(file);


        System.out.println(lines.get(1));
        String[] l = lines.get(1).split(",");
        System.out.println(l);
     /*   System.out.println(lines);*/
    }catch(IOException e){
        e.printStackTrace();
    }
    }
}

