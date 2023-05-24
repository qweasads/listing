package org.example;
import java.io.*;

public class FileByReader {
    File file = new File("file.bin");
    InputStream is = new FileInputStream(file);
    long lenght = file.length();
    if( lenght > Integer.MAX_VALUE)

    {
        throw new IOException("Файл " + file.getName() + "слишком длинный!")
    }

    {
        byte[] bytes = new byte[(int) lenght];
        int offset = 0;
        int numRead = 0;
        while (true) {
            try {
                if (!(offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            offset += numRead;
        }
        {
            if (offset < bytes.length)
                throw new IOException("Не удалось прочитать файл " + file.getName() + " целиком.");
        }
        public FileByReader() throws FileNotFoundException, IOException {
    }
        try {
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public FileByReader() throws FileNotFoundException {
    }

    public long getLenght() {
        return lenght;
    }

    public void setLenght(long lenght) {
        this.lenght = lenght;
    }
}


