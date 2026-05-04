package day12;

import java.io.*;
public class ReverseFileContent {
	public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/test/java/day12/Content.txt"));
            String line = br.readLine();
            br.close();

            String reversed = new StringBuilder(line).reverse().toString();

            BufferedWriter bw = new BufferedWriter(new FileWriter("src/test/java/day12/Content.txt"));
            bw.write(reversed);
            bw.close();

            System.out.println("File reversed successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

