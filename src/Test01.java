import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\music.txt");
        File file = new File("F:\\");
        File files[] = file.listFiles();
        for (File f:files) {
            if(f.getName().endsWith(".mp3")) {
                System.out.println(f.getName());
                fileWriter.write(f.getName());
                fileWriter.write(13);
                fileWriter.write(10);
            }
        }   fileWriter.close();
       // byte buff[] = new byte[0];
        FileOutputStream fops = new FileOutputStream("E:\\aJojimusic.mp3");
        FileReader fr = new FileReader("E:\\music.txt");
        BufferedReader br = new BufferedReader(fr);
        String mp3Name = "";
        while ((mp3Name=br.readLine())!=null) {
           // System.out.println(mp3Name);
            FileInputStream fips = new FileInputStream("E:\\"+mp3Name);
                int a=0;
                while ((a=fips.read())!=-1) {
                    fops.write(a);
                }
        }
        fops.close();
    }
}
