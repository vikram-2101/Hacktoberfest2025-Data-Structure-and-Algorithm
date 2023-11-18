import java.util.*;
public class arrays {
    public static void main(String[] args) {
    //         //int[] marks = new int[3];
    // //  marks[0] = 97;
    // //  marks[1] = 98;
    // //  marks[2] = 95;
    // int marks[]= {97,98,95};
    // for(int i=0; i<3; i++) {
    //     System.out.println(marks[i]);
    // }


    // Scanner sc = new Scanner(System.in);
    // int size= sc.nextInt();
    // int numbers[] = new int [size];
    // for(int i=0; i<size; i++) {
    //     System.out.println(numbers[i]);
    // }

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[]= new int[size];

    //important
    //input
//  to find a variable in an output
     for(int i=0; i<size; i++) { 
        numbers[i] = sc.nextInt();
     }
     int x = sc.nextInt();
     //output
     
     for(int i=0; i<size; i++) {
        if(numbers[i] ==x) {
            System.out.println("x found at index " +i);
        }
     }
    }
}