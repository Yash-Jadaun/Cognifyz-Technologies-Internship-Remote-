package Level1;
import java.util.Random;
import java.util.Scanner;
public class Task4 {
    
  static void password(){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the length of password");
    int n=s.nextInt();

    String capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String small_chars="abcdefghijklmnopqrstuvwxyz";
    String numbers="0123456789";
    String symbols = "!@#$%^&*_-+=|/.?/<>"; 
    String values=capital_chars+small_chars+numbers+symbols;

    Random rndm =new Random();
    char[] password = new char[n];

    for(int i=0;i<n;i++){
        password[i] = values.charAt(rndm.nextInt(values.length()));
    }

    System.out.println(password);

  }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        password();
    }
}
