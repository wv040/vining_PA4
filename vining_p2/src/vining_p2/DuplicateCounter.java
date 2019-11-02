package vining_p2;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;

public class DuplicateCounter {

    public HashMap<String, Integer> duplicateCounter = new HashMap<String, Integer>();

    public void count(File dataFile) throws FileNotFoundException
    {
        Scanner in = new Scanner(dataFile);
        String word;
        int counter;


        while (in.hasNext())
        {
            word = in.next().trim();
            if (this.duplicateCounter.containsKey(word))
            {
                counter = this.duplicateCounter.get(word) + 1;
            }
            else
            {
                counter = 1;
            }
            this.duplicateCounter.put(word, counter);
        }
    }

    public void write(File outputFile) throws IOException
    {
        outputFile.createNewFile(); // executes iff the specified file does not exist
        FileWriter out = new FileWriter(outputFile, false);

        for (String word: this.duplicateCounter.keySet())
        {
            //String outputString = word;
            String counter = this.duplicateCounter.get(word).toString();
//            out.write(word + "\t" + counter + "\n");
            out.write(String.format("%-15s %-2s\n", word, counter));
        }

        out.flush();
        out.close();
    }
}
