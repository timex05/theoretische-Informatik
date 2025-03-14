

public class Palindrome {

    private boolean isPalindrome(String word){
        if(word.length() < 2) return true;

        if(word.substring(0, 1).equals(word.substring(word.length()-1)))
            return isPalindrome(word.substring(1, word.length()-1));
        else 
            return false;
    }


    

    public static void main(String[] args) {
        Palindrome pd = new Palindrome();
        System.out.println("ssss: " + pd.isPalindrome("ssss"));
        System.out.println("a: " + pd.isPalindrome("a"));
        System.out.println("ada: " + pd.isPalindrome("ada"));
        System.out.println(": " + pd.isPalindrome(""));
    }

    
}
