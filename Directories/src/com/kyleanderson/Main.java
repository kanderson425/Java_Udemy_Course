package com.kyleanderson;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory)) {
            for(Path file: contents) {
                System.out.println(file.getFileName());
            }

        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
