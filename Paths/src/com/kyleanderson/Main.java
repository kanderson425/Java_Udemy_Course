package com.kyleanderson;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {
            //Size & Modified Date
            Path filePath = FileSystems.getDefault().getPath("Examples","Dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = "+ size);
            System.out.println("Last modified = "+ Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is directory = " + attrs.isDirectory());
            System.out.println("Is regular file = " + attrs.isRegularFile());


            //Creates a File
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Files.createFile(fileToCreate);

            //Creates a Directory
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.createDirectory(dirToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//            Files.createDirectories(dirToCreate);

            //Deleting File
//            Path fileToDelete = FileSystems.getDefault().getPath("Examples","Dir1","file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

            //Renaming File
//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Files.move(fileToMove, destination);


            //Moving File
//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","Dir1","file1copy.txt");
//            Files.move(fileToMove, destination);

            //Copying File
//            Path sourceFile = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples","file1copy.txt");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples","Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.copy(sourceFile,copyFile, StandardCopyOption.REPLACE_EXISTING);

        } catch(IOException e) {
            System.out.println(e.getMessage());
        }




    }
//        Path path = FileSystems.getDefault().getPath("workingDirectoryFile.txt");
//        printFile(path);
////        Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
//        Path filePath = Paths.get(".","files", "SubdirectoryFile.txt");
//        printFile(filePath);
////        filePath = Paths.get("/Users/kyleanderson/Code/Java/Java_Udemy_Course/OutThere.txt ");
//        filePath = Paths.get("/Users/kyleanderson/Code","/Java/Java_Udemy_Course","OutThere.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".","files","..","files","SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("/Volumes/Test/ING","abcdef","whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//
//        System.out.println("Exists = " + Files.exists(path4));
//
//    }

//    private static void printFile(Path path) {
//        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}


