package FileHandling;

import java.io.*;
// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.InputStream;

// import java.io.IOException;
// import java.io.OutputStream;
// import java.io.InputStreamReader;
// import java.io.OutputStream;
// import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {


        //create
        try {
            File fo = new File("new-file.txt");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
    }

    // write to this file
    try {
        FileWriter fw = new FileWriter("new-file.txt");
        fw.write("suraj chomua");
        fw.close();
    } catch (IOException e) {
        System.out.println(e.getMessage());
}

// reading from a file 
try(BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
    while (br.ready()) {
        System.out.println(br.readLine());
    }
} catch (IOException e) {
    System.out.println(e.getMessage());
    }
}
}