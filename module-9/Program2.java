/*
 * Stephanie Ramos
 * September 19, 2025
 * 
 * M8: Programming Assignment
 * This program creates or appends ten random integers to data.file, 
 * then reopens the file and displays its contents.
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Program2 {
    public static void main(String[] args) {
        // Create the file "data.file" if it does not exist
        Path file = Paths.get("data.file");

        // Write or append 10 random integers to the file
        try (BufferedWriter bw = Files.newBufferedWriter(
                file,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND)) {

            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                int n = rand.nextInt(100); // generate a random number 0–99
                bw.write(Integer.toString(n));
                if (i < 9) bw.write(" "); // separate numbers with space
            }
            bw.newLine(); // move to next line after 10 numbers
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
            return;
        }

        // Reopen the file, read all contents, and display them
        try {
            String content = Files.readString(file);
            System.out.println("File contents:");
            System.out.println(content.trim());
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
