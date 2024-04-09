package decorator.io;

import java.io.*;

/**
 * @author lh
 */
public class InputTest {
    public static void main(String[] args) {
        int c ;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));
            while ((c = in.read()) >=0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
