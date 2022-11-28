
import java.io.*;

public class BufferedStreamsTest {

    public static void main(String[] args) {

//		InputStream is = System.in;
//		OutputStream os = System.out;
//		
//		
//		InputStreamReader isr = new InputStreamReader(is);
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		
//		BufferedReader br = new BufferedReader(isr);
//		BufferedWriter bw = new BufferedWriter(osw);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str;
            do {
                bw.write("Enter word: ");
                bw.newLine();
                bw.flush();
                str = br.readLine();
                bw.write(str);
                bw.write("\nEnter exit for exit\n");
                bw.flush();
                str = br.readLine();
            } while (!str.equalsIgnoreCase("exit"));
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
