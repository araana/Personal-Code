public class Factorial {
    int n;

    public Factorial(int n){
        n= this.n;
    }

    public int getFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        return fact;
    }
}
