package com.kyleanderson;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, "*.dat")) {
            for(Path file: contents) {
                System.out.println(file.getFileName());
            }

        }catch(IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
    }
}
