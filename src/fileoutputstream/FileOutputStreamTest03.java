package fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class FileOutputStreamTest03 {

    public static void main(String[] args) throws IOException {

        // 성적 입력
        int kor1 = 0;
        int kor2 = 0;
        int kor3 = 0;
        FileInputStream fileInputStream = new FileInputStream("res/text03.txt");
        Scanner fileScanner = new Scanner(fileInputStream);

        kor1 = fileScanner.nextInt();
        kor1 = fileScanner.nextInt();
        kor1 = fileScanner.nextInt();

        fileScanner.close();
        fileInputStream.close();

        //성적 출력
        int total = kor1 + kor2 + kor3;
        float avg = total / 3;

        // 성적 저장
        FileOutputStream fileOutputStream = new FileOutputStream("res/text03-out.txt");
        PrintWriter printWriter = new PrintWriter(fileOutputStream, true, Charset.forName("UTF-8"));

        printWriter.printf("total is %d\n", total);
        printWriter.printf("avg is %f\n", avg);

        printWriter.close();
        fileOutputStream.close();

    }

}
