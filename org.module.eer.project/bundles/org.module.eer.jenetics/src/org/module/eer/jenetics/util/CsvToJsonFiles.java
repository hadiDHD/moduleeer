package org.module.eer.jenetics.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CsvToJsonFiles {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\hadid\\OneDrive\\Desktop\\University\\06 June\\ecore_model_df.csv";
        String savePath = "C:\\Users\\hadid\\Downloads\\EcoreModelSetCleanedJson\\";
        String line;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Skip the header
            br.readLine();

            while ((line = br.readLine()) != null) {
                // Find the first comma
                int commaIndex = line.indexOf(',');

                if (commaIndex != -1) {
                    // Split into file name and JSON content
                    String fileName = line.substring(0, commaIndex).trim();
                    String jsonContent = line.substring(commaIndex + 1).trim();

                    if (jsonContent.length() > 1) {
                        jsonContent = jsonContent.substring(1, jsonContent.length() - 1);
                    }

                    // Create a JSON file for each row
                    try (FileWriter file = new FileWriter(savePath + fileName + ".json")) {
                        file.write(jsonContent);
                        System.out.println("Successfully wrote JSON object to file: " + fileName + ".json");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
