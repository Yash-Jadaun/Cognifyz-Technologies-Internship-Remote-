package Level1;

import java.util.Scanner;
public class Task2 {
    
    static void palindrome(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      String s = sc.nextLine();

       boolean isplaindrome = true;
       int n = s.length();
      
       for( int i=0;i<n/2;i++){
        if(s.charAt(i) != s.charAt(n-1-i)){
            isplaindrome = false;
            break;
        }
       }

       if(isplaindrome){
        System.out.println("Palindrome");
       }else{
        System.out.println("Not a Palindrome");
       }
       sc.close();
         }
  
  
     public static void main(String[] args) {
     palindrome();
    }
}
