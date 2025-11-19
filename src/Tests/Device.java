package Tests;

import java.io.IOException;

public class Device implements AutoCloseable {
    String header = null;

    public void open() {
        header = "OPENED";
        System.out.println("Device Opened");
    }

    public String read() throws IOException {
        throw new IOException("Unknown");
    }

    public void writeHeader(String str) throws IOException {
        System.out.println("Writing : " + str);
        header = str;
    }

    public void close() {
        header = null;
        System.out.println("Device closed");
    }

    public static void testDevice() {
        Device d = new Device();
        try (d) {
            d.open();
            d.read();               //throws exception and closes the try, but the catch is, if we close the try, d.close() will be called
            d.writeHeader("TEST");  //meaning that the flow is |Print Device Open(d.open()) -> d.read() throws exception -> try gets closed (we use d.close() thus output Device closed)
            d.close();                                                                                  // -> we catch the IOException so we print "Got Exception"
        } catch (IOException e) {
            System.out.println("Got Exception");
        }
    }

    public static void main(String[] args) {
        Device.testDevice();
    }
}