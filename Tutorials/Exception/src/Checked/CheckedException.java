package Checked;

import java.io.*;

public class CheckedException {
    public static void IO() throws IOException {
        FileInputStream F = null;
        try {
            F = new FileInputStream("/home/mayur/GFG.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void CL() throws ClassNotFoundException {
        try {
            Class temp = Class.forName("Bucket");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        IO();
        CL();
    }
}
