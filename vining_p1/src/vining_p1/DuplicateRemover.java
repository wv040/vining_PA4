package vining_p1;

import java.io.*;
import java.util.Scanner;
import java.util.HashSet;

public class DuplicateRemover {

    public HashSet<String> uniqueWords = new HashSet<String>();

    public void remove(File dataFile) throws FileNotFoundException
    {
        Scanner in = new Scanner(dataFile);
        String word;

        while (in.hasNext())
        {
            word = in.next().trim(); // scan in next word, trim whitespace
            this.uniqueWords.add(word); // returns false if the word already exists and does not add its duplicate
        }
    }

    public void write(File outputFile) throws IOException
    {
        outputFile.createNewFile(); // executes iff the specified file does not exist
        FileWriter out = new FileWriter(outputFile, false);

        for (String word: this.uniqueWords)
        {
            out.write(word + "\n");
        }

        out.flush();
        out.close();
    }
}
