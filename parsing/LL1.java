package parsing;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LL1 {
    public static void main(String[] args) {
        LL1 myLl1 = new LL1();
        String code = "";

        Stack<String> stack = new Stack<>();

        if(myLl1.scanCode(1, code) && myLl1.parseTokens(1, stack)){
            System.out.println("The code is accepted");
        } else {
            System.out.println("The code is not accepted");
        }


    }

    List<String> token = new ArrayList<>();

    public boolean scanCode(int state, String input){



        return false;
    }

    public boolean parseTokens(int state, Stack<String> stack){


        return false;
    }


}
