package org.example;
import java.io.*;
import sun.misc.*;
public class Base64Demo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("usage: Base64Demo text");
            System.exit(1);
        }
        String text = args[0];
        Base64Encoder enc = new Base64Encoder();
        String encoder = enc.encode(text.getBytes());
        enc = null;
        String decoded = null;
        String encoded = null;
        try {
            Base64Decoder dec = new Base64Decoder();
            decoded = new String(dec.decodeBuffer(encoded));
            dec = null;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Закодировано:" + encoded);
        System.out.println("Декодировано:" + decoded);

        encoded = null;
        decoded = null;
    }
}
