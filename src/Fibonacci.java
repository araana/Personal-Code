import java.util.Scanner;
public class Fibonacci {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence :");
        int a = scan.nextInt();
        System.out.println("Fibonacci Sequence:");
        for(int i=0;i<a;i++){
            System.out.print(Fib(i) +" ");
        }

    }

    public static int Fib(int n){
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return Fib(n-1)+Fib(n-2);
        }
    }

}
