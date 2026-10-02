public class Logical {
    public static void main(String[] args){

        //Problem: A student is eligible for an exam if: Attendence is 75% or more, AND Internal mark is 40 or more.

        int marks=15;
        float attendance=85;
      /*   if(attendance>=75 && marks>=40){
            System.out.println("Student is eligible for exam");
        }else{
            System.out.println("Student is not eligible for exam");
        }
*/

        if(attendance>=75 || marks>=40){
            System.out.println("Student is eligible for exam");
        }else{
            System.out.println("Student is not eligible for exam");
        }

    }
}
