package pl.sdacademy.serialization;

import java.io.Serializable;

public class SerializationSampleObject implements Serializable {
    public static final long serialVersionUID = -2001468476590015997L;
    private String stringValue;
    private transient String transientStringValue;
    private int intValue;
    private transient int transientIntValue;
    private double a;

    public SerializationSampleObject() {
        System.out.println("Constructor created");
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getTransientStringValue() {
        return transientStringValue;
    }

    public void setTransientStringValue(String transientStringValue) {
        this.transientStringValue = transientStringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public int getTransientIntValue() {
        return transientIntValue;
    }

    public void setTransientIntValue(int transientIntValue) {
        this.transientIntValue = transientIntValue;
    }

    @Override
    public String toString() {
        return "SerializationSampleObject{" +
                "stringValue='" + stringValue + '\'' +
                ", transientStringValue='" + transientStringValue + '\'' +
                ", intValue=" + intValue +
                ", transientIntValue=" + transientIntValue +
                '}';
    }
}
