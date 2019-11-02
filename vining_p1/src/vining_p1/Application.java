package vining_p1;

import java.io.*;
import java.io.File;


public class Application {

    public static void main(String[] args) throws IOException{

        DuplicateRemover duplicateRemover = new DuplicateRemover();

        File dataFile = new File("/Users/wyattvining/Desktop/vining_PA4/vining_p1/src/vining_p1/problem1.txt");

        File outputFile = new File("/Users/wyattvining/Desktop/vining_PA4/vining_p1/src/vining_p1/unique_words.txt");

        duplicateRemover.remove(dataFile);

        duplicateRemover.write(outputFile);
    }
}
