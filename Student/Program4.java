import java.util.Scanner;
public class Program4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Age: ");
 int age=sc.nextInt();

 if(age>=18){
    System.out.println("Eligible for Votting!!!");
 }else{
    System.out.println("Sorry you are not Eligible for Votting!!! ");
 }
    }
}
