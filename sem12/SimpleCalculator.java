package sem12;

import java.util.Stack;

public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        System.out.println(simpleCalculator.calculate("+2+35"));
        System.out.println(simpleCalculator.calculate("-9+3-42"));

    }

    public int calculate(String expression){

        Stack<Integer> stack = new Stack<>();
        for(int i = expression.length() -1; i >= 0; i--){
            String character = String.valueOf(expression.charAt(i));



            try {
                int val = Integer.parseInt(character);
                stack.push(val);
            } catch (Exception e) {
                if(character.equals("+")){
                    int value1 = stack.pop();
                    int value2 = stack.pop();
                    stack.push(value1 + value2);
                }
                if(character.equals("-")){
                    int value1 = stack.pop();
                    int value2 = stack.pop();
                    stack.push(value1 - value2);
                }

                if(character.equals("*")){
                    int value1 = stack.pop();
                    int value2 = stack.pop();
                    stack.push(value1 * value2);
                }
            }
        }
        return stack.pop();


    }
}
