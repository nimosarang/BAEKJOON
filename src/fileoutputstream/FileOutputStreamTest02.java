package fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class FileOutputStreamTest02 {

    public static void main(String[] args) throws IOException {

        // 성적 계산
        int kor1 = 100;
        int kor2 = 100;
        int kor3 = 80;

        // 성적 저장
        FileOutputStream fileOutputStream = new FileOutputStream("res/exam.txt");
        PrintWriter printWriter = new PrintWriter(fileOutputStream, true, Charset.forName("UTF-8"));

        // Binary로 저장
        fileOutputStream.write(kor1);
        fileOutputStream.write(kor2);
        fileOutputStream.write(kor3);

        // ASCII로 저장
        printWriter.print(kor1);
        printWriter.print(kor2);
        printWriter.print(kor3);

        printWriter.close();
        fileOutputStream.close();

    }

}
