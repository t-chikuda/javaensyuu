import java.io.*;

public class AddLineNumber {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\java\\test.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("C:\\java\\test2.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String s; //
            int lineNumber = 1;
            while ((s = br.readLine()) != null) {
                bw.write(lineNumber + " " + s + "\r\n");
                lineNumber++;
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
