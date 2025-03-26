package sem_3;

public class WordSorter {
    
    public boolean llo(String string1, String string2){

        if(string1.length() < string2.length()) return true;
        if(string1.length() > string2.length()) return false;


        return string1.compareTo(string2) <= 0;
    }

    public static void main(String[] args) {
        WordSorter ws = new WordSorter();
        String a = "aa";
        String b = "bb";
        System.out.println(a + " " + b + ": " + ws.llo(a, b));


        a = "zzz";
        b = "afefwf";
        System.out.println(a + " " + b + ": " + ws.llo(a, b));

        a = "zzz";
        b = "s";
        System.out.println(a + " " + b + ": " + ws.llo(a, b));

        a = "zzz";
        b = "zzz";
        System.out.println(a + " " + b + ": " + ws.llo(a, b));

        a = "aaab";
        b = "aaba";
        System.out.println(a + " " + b + ": " + ws.llo(a, b));
    }
}
