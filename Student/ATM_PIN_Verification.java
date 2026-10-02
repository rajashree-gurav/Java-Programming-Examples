import java.util.Scanner;
public class ATM_PIN_Verification {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

int correctPin=1234;
int bal=1000000;


System.out.println("Enter the Pin: ");
int pin=sc.nextInt();

if(pin==correctPin){
    System.out.println("Pin Correct!!");

    System.out.println("Enter the amount to withdraw:");
    int withdraw_amt=sc.nextInt();

    if(withdraw_amt<=bal){
        System.out.println("Withdraw is Successful!!");
        System.out.println("withdraw Amount="+withdraw_amt);
        System.out.println("Balance="+(bal-withdraw_amt));

    }else{
        System.out.println("Invalid PIN!!!");
    }
}

    }
}
