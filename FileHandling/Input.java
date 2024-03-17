yhjgpackage FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) {
        
    
try (InputStreamReader isr = new InputStreamReader(System.in)) {
        System.out.println("Enter some letter: ");
        int letters = isr.read();
        while(isr.ready()) {
        System.out.println((char) letters);
        letters = isr.read();
        }
        isr.close();
        System.out.println();
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }

        try (FileReader fr = new FileReader("note.txt")) {
        System.out.println("Enter some letter: ");
        int letters = fr.read();
        while (fr.ready()) {
        System.out.print((char) letters);
        letters = fr.read();
        }
        fr.close();
        System.out.println();
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in))) {
        System.out.println("You typed: " + br.readLine());
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
        while(br.ready()) {
        br.readLine();
        }
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }
}
}
