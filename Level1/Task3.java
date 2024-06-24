package Level1;
import java.util.Scanner;

public class Task3 {
   
    static void grade(){
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.of grades to be enter");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("enter the marks out of 10");
            int marks=s.nextInt();
            sum+=marks;
        }
        double avg=sum/n;
        if(8<=avg && avg<=10){
            System.out.println("the avg grade is A");
        }else if(6<= avg && avg<=8){
            System.out.println("The avg grade is B");
        }else{
            System.out.println("the avg grade is B");
        }
        
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
        grade();
    }
}
