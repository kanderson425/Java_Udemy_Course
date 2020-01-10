package com.kyleanderson;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {

//        DirectoryStream.Filter<Path> filter =
//                new DirectoryStream.Filter<Path>() {
//                    public boolean accept(Path path) throws IOException {
//                        return (Files.isRegularFile(path));
//                    }
//                };

        //This utilizes a lambda expression to achieve the same filter
        DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);
        Path directory = FileSystems.getDefault().getPath("FileTree/Dir2");
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
            for(Path file: contents) {
                System.out.println(file.getFileName());
            }

        }catch(IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
    }
}
