import java.util.Scanner;
public class MultiplePrograms {
    public static void main (String [] args){
        int exit = 1;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Which of the following programs would you like to execute");
            System.out.println("1.Fibonacci Series");
            System.out.println("2.Factorial Calculation");
            System.out.println("3.Area");
            System.out.println("4.Palindrome Number");
            System.out.println("5.Exit");
            int a = scan.nextInt();

            System.out.println();
            if (a == 1) {
                System.out.println("Please enter a fibonacci length");
                int l = scan.nextInt();
                Fibonaci fib = new Fibonaci(l);
                fib.getFibonaci(l);
            }
            else if (a == 2) {
                System.out.println("Please enter the Factorial number");
                int l = scan.nextInt();
                Factorial fact = new Factorial(l);
                System.out.println("The factorial number is " + fact.getFactorial(l));
            }
            else if (a==3){
                System.out.println("Please enter legnth of square");
                int l = scan.nextInt();
                Area square = new Area(l);
                System.out.println("The area of the square is " + square.getArea(l));
            }
            else if (a==4){
                System.out.println("Enter a palindrome number");
                int l = scan.nextInt();
                Palindrome pal = new Palindrome(l);
                boolean p = pal.getPal(l);
                if(p){
                    System.out.println("The given number is a palindrome number");
                }
                else{
                    System.out.println("The given number is not a palindrome number");
                }
            }
            else if (a == 5){
                exit = 0;
            }
            else{
                System.out.println("The given number is invalid,  Please enter correct number");
            }
            System.out.println();
        } while (exit ==1);
    }
}
