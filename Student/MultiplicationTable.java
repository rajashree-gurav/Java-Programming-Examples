public class MultiplicationTable {
    public static void main(String args[]){
        int n=Integer.parseInt(args[0]);

        System.out.println("Multiplication Table");

        for(int i=1;i<=n;i++){
            for(int j=1;i<=n;j++){
                System.out.println(" "+i*j+" ");
            }
            System.out.println("\n");
        }
    }
}
