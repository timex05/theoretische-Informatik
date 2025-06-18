package parsing;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LL1 {
    public static void main(String[] args) {
        LL1 myLl1 = new LL1();
        String code = "CALC IF COND BEGIN CALC END ELSE BEGIN CALC END";
        String code2 = "CALC CALC";
        String code3 = "IF COND BEGIN CALC CALC END ELSE BEGIN IF COND BEGIN CALC END END";
        String fail = "CALC CALC BEGI CALC";

        /*
         * Grammatik:
         * S -> CALC | CALC S | 
         * IF COND BEGIN S END | 
         * IF COND BEGIN S END S |
         * IF COND BEGIN S END ELSE BEGIN S END |
         * IF COND BEGIN S END ELSE BEGIN S END S |
         * 
         * 
         * scanning automat prüft ob wörter existere und richtig sind
         */

        Stack<String> stack = new Stack<>();

        if(myLl1.scanCode(1, fail)){
            System.out.println("The code is accepted");
        } else {
            System.out.println("The code is not accepted");
        }
        for(String token : myLl1.token){
            System.out.println(token + ", ");
        }


    }

    List<String> token = new ArrayList<>();

    public boolean scanCode(int state, String input){
        if(input.length() == 0){
            if(state == 1) return true;
            if(state == 3){
                token.add("IF");
                return true;
            }
            if(state == 7){
                token.add("CALC");
                return true;
            }
            if(state == 10){
                token.add("COND");
                return true;
            }
            if(state == 15){
                token.add("BEGIN");
                return true;
            }
            if(state == 19){
                token.add("ELSE");
                return true;
            }
            if(state == 21){
                token.add("END");
                return true;
            }
            return false;
        }
        switch (input.charAt(0)) {
            case 'I':
                if(state == 1)
                    return scanCode(2, input.substring(1));
                if(state == 13)
                    return scanCode(14, input.substring(1));
                
                return false;

            case 'F':
                if(state == 2)
                    return scanCode(3, input.substring(1));
                
                return false;

            case ' ':
                if(state == 3){
                    token.add("IF");
                    return scanCode(1, input.substring(1));
                }
                if(state == 7){
                    token.add("CALC");
                    return scanCode(1, input.substring(1));
                }

                if(state == 10){
                    token.add("COND");
                    return scanCode(1, input.substring(1));
                }

                if(state == 15){
                    token.add("BEGIN");
                    return scanCode(1, input.substring(1));
                }
                if(state == 19){
                    token.add("ELSE");
                    return scanCode(1, input.substring(1));
                }
                if(state == 21){
                    token.add("END");
                    return scanCode(1, input.substring(1));
                }

                return false;

            case 'C':
                if(state == 1)
                    return scanCode(4, input.substring(1));
                if(state == 6)
                    return scanCode(7, input.substring(1));

                return false;   
            
            case 'A':
                if(state == 4)
                    return scanCode(5, input.substring(1));

                return false; 
            
            case 'L':
                if(state == 5)
                    return scanCode(6, input.substring(1));
                if(state == 16)
                    return scanCode(17, input.substring(1));

                return false; 

            case 'O':
                if(state == 4)
                    return scanCode(8, input.substring(1));

                return false;

            case 'N':
                if(state == 8)
                    return scanCode(9, input.substring(1));
                if(state == 14)
                    return scanCode(15, input.substring(1));
                if(state == 16)
                    return scanCode(20, input.substring(1));

                return false;
            
            case 'D':
                if(state == 9)
                    return scanCode(10, input.substring(1));
                if(state == 20)
                    return scanCode(21, input.substring(1));

                return false;
            
            case 'B':
                if(state == 1)
                    return scanCode(11, input.substring(1));

                return false;

            case 'E':
                if(state == 11)
                    return scanCode(12, input.substring(1));
                if(state == 1)
                    return scanCode(16, input.substring(1));
                if(state == 18)
                    return scanCode(19, input.substring(1));
                

                return false;
            
            case 'G':
                if(state == 12)
                    return scanCode(13, input.substring(1));

                return false;
            
            case 'S':
                if(state == 17)
                    return scanCode(18, input.substring(1));

                return false;
            
            

            default:
                return false;
        }
    }

    public boolean parseTokens(int state, Stack<String> stack){


        return false;
    }


}
