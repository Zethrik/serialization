package pl.sdacademy.serialization;

import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        SerializationSampleObject myObject = new SerializationSampleObject();
        myObject.setStringValue("This is string value");
        myObject.setTransientStringValue("This is transient string value");
        myObject.setIntValue(123);
        myObject.setTransientIntValue(987);
        System.out.println(myObject);

//        new ObjectOutputStream()
    }
}
