package com.api.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerialDemo {
    public static void main(String[] args) {
        try (
                FileInputStream fileInputStream = new FileInputStream("stud.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                ) {
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
