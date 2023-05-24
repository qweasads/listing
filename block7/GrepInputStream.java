package org.example;
import java.io.*;

public class GrepInputStream {
    class grepInputStream extends FileInputStream {
        String substring = null;
        BufferedReader br;
        public grepInputStream(InputStream in, String substring) throws FileNotFoundException {
            super(in.toString());
            this.br = new BufferedReader(new
                    InputStreamReader(in));
            this.substring = substring;
        }
        public final String readLine() throws IOException {
            String line;
            do {
                line = br.readLine();
            } while ((line != null) && line.indexOf(substring) == -1);
            return line;
        }
    }
}

