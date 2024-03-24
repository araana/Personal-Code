public class PalindromeWord {
    String word;

            public PalindromeWord(String word){
                word = this.word;
            }

            public Boolean toString(String word){
                String palWord = word;
                int j = palWord.length() - 1;
                boolean palinDrome = false;
                int i =0;
                while (i<j){
                    if (palWord.charAt(i) == palWord.charAt(j)){
                        palinDrome =  true;
                    }
                    else{
                        palinDrome =  false;
                    }
                    j--;
                    i++;
                }
                return palinDrome;
            }

}
