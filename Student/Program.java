import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name:");
        String name=sc.next();

        System.out.println("Enter your age:");
        String age=sc.next();

        System.out.println("Hello!!! "+name);
        System.out.println("I am "+age+" Years old");

    }
}
