import java.util.Random;
import java.util.Scanner;
public class sugoroku{
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc= new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println("Hello,"+name+"!");
        
        Random x=new Random();
        System.out.println("Rolling dice...");
        int n1=x.nextInt(6)+1;
        int n2=x.nextInt(6)+1;
        int sum=n1+n2;  
        System.out.println("Die 1:"+n1);
        System.out.println("Die 2:"+n2);
        System.out.println("Total value:"+sum);
     }
}