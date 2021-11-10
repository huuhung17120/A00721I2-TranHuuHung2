package com.codegym;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile rwFile = new ReadAndWriteFile();
        File sourceFile = new File("D:\\A00721I2-TranHuuHung2\\Module2\\16 IO-Text-File\\BaiTap\\Copy-file-text\\source.txt");
        File targetFile = new File("D:\\A00721I2-TranHuuHung2\\Module2\\16 IO-Text-File\\BaiTap\\Copy-file-text\\target.txt");
        rwFile.copyDirectory(sourceFile,targetFile);
    }
}
