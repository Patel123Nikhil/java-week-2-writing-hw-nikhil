package java_writing_homework;
 // Write a Java program to swap two variables.


import java.util.Scanner;

public class Prg15 {

    public static void main(String[] args) {

    //Scanner declaration for reading input form console
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first variable value : ");
    int first = scanner.nextInt();
        System.out.print("Enter the second variable value : ");
    int second = scanner.nextInt();
    Prg15 prg15 = new Prg15();
    Prg15 t = new Prg15();
        t.swapTheValue(first,second);
    // closing the scanner object
        scanner.close();
}

    //Swapping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);
    }
}

