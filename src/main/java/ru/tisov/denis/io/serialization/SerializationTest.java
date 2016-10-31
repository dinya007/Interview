package ru.tisov.denis.io.serialization;

import java.io.*;

public class SerializationTest {

    public static void main(String[] args) {
        new SerializationTest().go();
    }

    private void go() {
        Child child = new Child();

        System.out.println("Serialization ...");
        Child readObject = writeAndReadObject(child);

        System.out.println(readObject);
    }


    private <T extends Serializable> T writeAndReadObject(T object) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);

            oos.writeObject(object);

            oos.flush();
            baos.flush();
            oos.close();
            baos.close();

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));

            return (T) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
