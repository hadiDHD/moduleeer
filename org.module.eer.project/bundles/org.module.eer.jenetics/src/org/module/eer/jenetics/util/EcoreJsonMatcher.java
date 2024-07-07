package org.module.eer.jenetics.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class EcoreJsonMatcher {

    public static void main(String[] args) {
        // Define the paths for pathA, pathB, and pathC
        String pathA = "C:\\Users\\hadid\\Downloads\\EcoreModelSetCleaned"; // Replace with the actual path
        String pathB = "C:\\Users\\hadid\\Downloads\\ModelsJson\\Ecore"; // Replace with the actual path
        String pathC = "C:\\Users\\hadid\\Downloads\\EcoreModelSetCleanedJson"; // Replace with the actual path

        // Create the output directory if it does not exist
        createDirectoryIfNotExists(pathC);

        // Get the set of ecore files in pathA
        Set<String> ecoreFiles = listFilesWithExtension(pathA, ".ecore");

        // Get the set of json files in pathB
        Set<String> jsonFiles = listFilesWithExtension(pathB, ".json");

        // Find matching json files for each ecore file and copy them to pathC
        for (String ecoreFile : ecoreFiles) {
            if (jsonFiles.contains(ecoreFile)) {
                System.out.println("Found matching json file for: " + ecoreFile + ".ecore");
                copyFile(pathB, pathC, ecoreFile + ".json");
            } else {
                System.out.println("No matching json file found for: " + ecoreFile + ".ecore");
            }
        }
    }

    // Method to list files with a specific extension in a directory
    public static Set<String> listFilesWithExtension(String directoryPath, String extension) {
        File directory = new File(directoryPath);
        Set<String> fileNames = new HashSet<>();

        // List all files in the directory
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                // Check if the file has the specified extension
                if (file.isFile() && file.getName().endsWith(extension)) {
                    // Add the file name without extension to the set
                    String fileNameWithoutExtension = file.getName().substring(0, file.getName().lastIndexOf('.'));
                    fileNames.add(fileNameWithoutExtension);
                }
            }
        }
        return fileNames;
    }

    // Method to create a directory if it does not exist
    public static void createDirectoryIfNotExists(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    // Method to copy a file from source directory to destination directory
    public static void copyFile(String sourceDir, String destinationDir, String fileName) {
        Path sourcePath = Paths.get(sourceDir, fileName);
        Path destinationPath = Paths.get(destinationDir, fileName);
        try {
            Files.copy(sourcePath, destinationPath);
            System.out.println("Copied " + fileName + " to " + destinationDir);
        } catch (IOException e) {
            System.err.println("Failed to copy " + fileName + ": " + e.getMessage());
        }
    }
}
