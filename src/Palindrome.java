public class Palindrome {
    int l;

    public Palindrome(int l){
        l = this.l;
    }

    public boolean getPal(int l){
        int pal = l;
        int rev=0;
        int c;
        Boolean b;
        String p = Integer.toString(pal);
        for (int i=0;i<p.length();i++){
            c = pal%10;
            rev= rev*10 + c;
            pal /=10;
        }
        System.out.println("Reverse " + rev);
        if (rev == l ){
            b = true;
        }
        else{
            b = false;
        }
        return b;
    }


}
