

public class Divides_3_4 {
    boolean run(int state, String word){
        if(word.isEmpty()) return (state == 4 || state == 8);

        switch (state) {
            case 0:
                if(word.charAt(0) == 'a')
                return run(1, word.substring(1)) || run(2, word.substring(1));
                break;
            case 1:
                if(word.charAt(0) == 'a')
                return run(3, word.substring(1));
                break;
            case 2:
                if(word.charAt(0) == 'a')
                return run(5, word.substring(1));
                break;
            case 3:
                if(word.charAt(0) == 'a')
                return run(4, word.substring(1));
                break;
            case 4:
                if(word.charAt(0) == 'a')
                return run(1, word.substring(1));
                break;
            case 5:
                if(word.charAt(0) == 'a')
                return run(7, word.substring(1));
                break;
            case 6:
                if(word.charAt(0) == 'a')
                return run(1, word.substring(1));
                break;
            case 7:
                if(word.charAt(0) == 'a')
                return run(8, word.substring(1));
                break;
            case 8:
                if(word.charAt(0) == 'a')
                return run(2, word.substring(1));
                break;
        
            default:
                break;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Divides_3_4 divides_3_4 = new Divides_3_4();
        System.out.println(divides_3_4.run(0, "aaaaaaaa"));
    }
}
