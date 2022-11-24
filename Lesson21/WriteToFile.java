package IOFile;

import java.io.*;
import java.util.Scanner;

public class WriteToFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String folderPath = "/Users/eclipse-workspace/forTestingMain";

        File folder = new File(folderPath);
        folder.mkdir();

        String filePath = folderPath + "/test.txt";

        File file = new File(filePath);
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            // bw.write("Hello world");
            while (true) {
                System.out.println("Enter string");
                String str = scan.nextLine();//nextLine передает фразу целиком
                bw.write(str);
                System.out.println("Another string? yes or no");
                str = scan.next();//next передает тольео слово
                if (str.equalsIgnoreCase("no")) {
                    break;
                }
                bw.newLine();
            }
            bw.close();
            scan.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
