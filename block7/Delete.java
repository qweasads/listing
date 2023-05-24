package org.example;
import java.io.File;
public class Delete {
    public static void deleteDir(String dirPath) {
        File walkDir = new File(dirPath);
        String[] dirList = walkDir.list();
        for (int i = 0; i < dirList.length; i++) {
            File f = new File(dirList[i]);
            if (f.isDirectory()) {
                deleteDir(f.getPath());
            }
            f.delete();
        }
        walkDir.delete();
    }
}

