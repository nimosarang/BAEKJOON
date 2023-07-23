package fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class FileOutputStreamTest {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("res/data.txt");
        PrintWriter printWriter = new PrintWriter(fileOutputStream, true, Charset.forName("UTF-8"));
        // byte 단위의 문자 코드만 출력하는 도구
//        fileOutputStream.write(40);
//        fileOutputStream.write(65);
//        fileOutputStream.write(100);
//        fileOutputStream.flush();
//        fileOutputStream.close();

        printWriter.print("Hello");
        printWriter.print("1234");
        printWriter.print("안녕하세요");

        System.out.print("Hello");
        System.out.print("1234");
        System.out.print("안녕하세요");

        printWriter.close();
        fileOutputStream.close();



    }

}
