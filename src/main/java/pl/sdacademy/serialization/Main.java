package pl.sdacademy.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        SerializationSampleObject myObject = new SerializationSampleObject();
        myObject.setStringValue("This is string value");
        myObject.setTransientStringValue("This is transient string value");
        myObject.setIntValue(123);
        myObject.setTransientIntValue(987);
        System.out.println(myObject);

//        try (OutputStream fos =
//                     new FileOutputStream("FirstSerializedObject.ser")) {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
//            objectOutputStream.writeObject(myObject);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        try (FileInputStream fis =
                    new FileInputStream("FirstSerializedObject.ser")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fis);
            SerializationSampleObject deserialized =
                    (SerializationSampleObject) objectInputStream.readObject();
            System.out.println(deserialized);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
