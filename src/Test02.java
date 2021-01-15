import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入你今天最想说的话：");
        try {
            String s=br.readLine();
            System.out.println("你最想表达的是：" + s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
