package JavaIODecorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        String testPath = new File("res/JavaIODecorator/test.txt").getAbsolutePath();

        try {
            InputStream in =
                new LowerCaseInputStream(
                    new BufferedInputStream(
                        new FileInputStream(testPath)));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
