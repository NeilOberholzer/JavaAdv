package com.example.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class NoDirWalk {
  public static void main(String[] args) {  

    try(Stream<Path> files = Files.list(Paths.get("."))){// Add try with resources here

        System.out.println("\n=== Dir walk ===");
        // Print directory list here  
        files.forEach(System.out :: println);
                
    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }

    try(Stream<Path> files = Files.walk(Paths.get("."))){

        System.out.println("\n=== Dir build ===");
        files
            .filter(path -> path.toString().contains("build"))
            .forEach(line -> System.out.println(line));  

    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }
  } 
}
