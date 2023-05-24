package org.example;
import javax.imageio.IIOException;
public class ExecProcess {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().Exec("notepad.exe");
        } catch (IIOException ioe) {
            ioe.printStackTrace();
        }
    }
}

