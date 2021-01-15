package copywj;

import java.io.*;

public class Copywj {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("F:\\copy.txt");
            FileWriter fileWriter = new FileWriter("E:\\copyy.txt");
            int n = 0;
            while ((n= fileReader.read())!=-1) {
                System.out.print((char)n);
                fileWriter.write((char)n);
            }
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
