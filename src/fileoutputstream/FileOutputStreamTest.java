package fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("res/data.txt");
        fileOutputStream.write(40);
        fileOutputStream.write(65);
        fileOutputStream.write(100);
        fileOutputStream.flush();

        fileOutputStream.close();
    }

}
