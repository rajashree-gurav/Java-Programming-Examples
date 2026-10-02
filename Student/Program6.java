import java.util.Scanner;
public class Program6 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A: ");
        int a=sc.nextInt();
System.out.println("Enter B: ");
int b=sc.nextInt();

if(a>b){
    System.out.println("A is the Biggest Number");
}else{
    System.out.println("B is the Biggest Number");
}
    }
}
