package ru.lixtezy;

import java.io.*;
import java.util.Scanner;

public class SearchTextInFile {
    public void func(String path, String find, String text) {

        File f = new File(path);
        String[] list = f.list();

        for (String file : list) {
            if (find.equals(file)) {
                System.out.println();
                return;
            }
        }
    }
}