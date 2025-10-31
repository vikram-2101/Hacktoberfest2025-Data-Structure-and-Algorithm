package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Output {
public static void main(String[] args) {
     OutputStream os = System.out;
        System.out.println();

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("hello world");
            osw.write(97);
            osw.write(10);
            char[] arr = "hello world".toCharArray();
            osw.write(arr);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter fw = new FileWriter("note.txt", true)) {
            fw.write("this should be appended");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}
}
