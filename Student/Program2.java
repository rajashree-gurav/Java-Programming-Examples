import java.util.Scanner;
public class Program2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str1="java";
        String str2="Programming";

        //1.length()
        System.out.println("Length="+str1.length());

        //2.toUpperCase()
        System.out.println("Uppercase="+str2.toUpperCase());

        //3.toLowerCase()
        System.out.println("LowerCase="+str2.toLowerCase());

        //4.equals()
        System.out.println("String are equal="+str1.equals(str2));

        //5.charAt()
        System.out.println("First Character="+str2.charAt(5));

        //6.contains()
        System.out.println("Contains 'a="+str1.contains("a"));

        //7.replace()
        System.out.println("Replace 'a' with '@'="+str1.replace("a","@"));


        //8.Substring
        if(str2.length()>=3){
            System.out.println("First 3 characters="+str2.substring(0,3));
        }

        //9.Concat()
        System.out.println("Concatenation="+str1.concat(""+str2));

        //10.trim()
        String trimString=" "+str2+" ";
        System.out.println("Before trim='"+trimString+"'");
        System.out.println("After trim='"+trimString.trim()+"'");
    }
}
