package Level1;
import java.io.*;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        tempConv();
    }




        static void tempConv(){
        System.out.println("Enter the Temperature in Celcius");
        Scanner s = new Scanner(System.in);
        float C = s.nextFloat();
        float f = (9*C/5) + 32;
        System.out.println("Temperature in Fahrenheit is:" + " " + f);


    }
}
