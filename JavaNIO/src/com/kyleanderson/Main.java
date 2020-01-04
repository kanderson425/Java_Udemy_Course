package com.kyleanderson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) {

        try(FileOutputStream binFile = new FileOutputStream("data.dat");
            FileChannel binChannel = binFile.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(100);
            byte[] outputBytes = "Hello World!".getBytes();
            byte[] outputBytes2 = "Nice to meet you".getBytes();
            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
            buffer.flip();

//            byte[] outputBytes = "Hello World!".getBytes();
//            buffer.put(outputBytes);
//            buffer.putInt(245);
//            buffer.putInt(-98765);
//            byte[] outputBytes2 = "Nice to meet you".getBytes();
//            buffer.put(outputBytes2);
//            buffer.putInt(1000);
//            buffer.flip();

            binChannel.write(buffer);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel channel = ra.getChannel();

            ByteBuffer readBuffer = ByteBuffer.allocate(100);
            channel.read(readBuffer);
            readBuffer.flip();
            byte[] inputString = new byte[outputBytes.length];
            readBuffer.get(inputString);
            System.out.println("inputString = " + new String(inputString));
            System.out.println("int1 = " + readBuffer.getInt());
            System.out.println("int2 = " + readBuffer.getInt());
            byte[] inputString2 = new byte[outputBytes2.length];
            readBuffer.get(inputString2);
            System.out.println("inputString2 = " + new String(inputString2));
            System.out.println("int3 = " + readBuffer.getInt());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
