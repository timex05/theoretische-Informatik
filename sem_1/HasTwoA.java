

public class HasTwoA {

    private boolean hasTwoA(String word){
        int counter = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a') counter ++;
        }
        return counter == 2;
    }

    public static void main(String[] args) {
        System.out.println(new HasTwoA().hasTwoA("aaba"));
    }
}
