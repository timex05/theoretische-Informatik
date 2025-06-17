package turing;

public class ADDITION_TM {

    int START = 1;
    int RIGHTTILLB = 2;
    int LEFTTILLSTART = 3;
    

    // aaaabaa -> aaaaaa

    public static void main(String[] args) {
        ADDITION_TM addition_TM = new ADDITION_TM();
        System.out.println(addition_TM.start("aba"));


    }

    public boolean start(String word){
        CharStack right = new CharStackImpl();

        char[] chars = word.toCharArray();

        for(int i = chars.length -1; i >= 0; i--){
            right.push(chars[i]);
        }

        return run(new CharStackImpl(), 1, right);
    }

    public boolean run(CharStack left, int state, CharStack right){

        if(state == START && (right.top() == 'a')){
            right.pop();
            state = RIGHTTILLB;
        }

        if(state == RIGHTTILLB && (right.top() == 'a')){
            left.push(right.pop());
        }

        if(state == RIGHTTILLB && (right.top() == 'b')){
            right.pop();
            right.push('a');
            state = LEFTTILLSTART;
        }


        if(state == LEFTTILLSTART && left.isEmpty()){
            while (!right.isEmpty()) {
                System.out.print(right.pop());
            }
            System.out.println();
            return true;
        }

        if(state == LEFTTILLSTART && !left.isEmpty()){
            right.push(left.pop());
        }
        return run(left, state, right);
    }
}
