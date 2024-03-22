public class Fibonaci {
    int n ;


    public Fibonaci(int n){
        n =this.n;
    }

    public static int getFibonaci(int n){
        System.out.println("The given Fibonacci series is");
        for(int i =0;i<n;i++){
            System.out.print(getSeries(i) +" ");
        }
        return n;
    }

    public static int getSeries(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return getSeries(n-1)+ getSeries(n-2);
        }
    }
}
