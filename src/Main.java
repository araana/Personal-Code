import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        System.out.println("Please enter the fibonacci length");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("The required fibonacci series is");

        for(int i=1;i<=a;i++){
            System.out.println(Fib(i));
        }
        System.out.println();

        System.out.println("Please enter the a number");
        int b = scan.nextInt();

        System.out.println("The required factorial calculation of integer " + b + " is "+Fact(b));

    }

    public static int Fib(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            return Fib(n-1)+Fib(n-2);
        }
    }

    public static int Fact(int n){
        if (n==0){
            return 1;
        }
        else{
            return n*Fact(n-1);
        }
    }
}