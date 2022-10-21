package java_writing_homework;
 /*Write a program to insert any temperature value in degree Fahrenheit
         and convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/


import java.util.Scanner;

public class Prg7 {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
        // Object creation
        Prg7 t = new Prg7();
        t.convertTempToDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();
    }

    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");
    }

}

