package edu.neu.csye6200;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileUtil {
	
	public static List<String> readCSV(String fileName){
		List<String> lines = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/resources/" + fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
            e.printStackTrace();
        }
        return lines;	
	}
	
	public static void writeCSV(String filePath, List<String> lines) {
        try (BufferedWriter br = Files.newBufferedWriter(Paths.get(filePath))) {
            for (String line : lines) {
                br.write(line);
                br.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + filePath);
            e.printStackTrace();
        }
    }
	

}
