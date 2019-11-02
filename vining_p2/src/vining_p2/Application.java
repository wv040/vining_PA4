package vining_p2;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        File dataFile = new File("/Users/wyattvining/Desktop/vining_PA4/vining_p2/src/vining_p2/problem2.txt");

        File outputFile = new File("/Users/wyattvining/Desktop/vining_PA4/vining_p2/src/vining_p2/unique_word_counts.txt");

        DuplicateCounter duplicateCounter = new DuplicateCounter();

        duplicateCounter.count(dataFile);

        duplicateCounter.write(outputFile);
    }
}
