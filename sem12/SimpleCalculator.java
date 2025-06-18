package sem12;


public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        System.out.println(simpleCalculator.calculate("+2+35"));
        System.out.println(simpleCalculator.calculate("-9+3-42"));

    }

    public double calculate(String expression){

        MyStack<Double> stack = new MyStack<>();
        for(int i = expression.length() -1; i >= 0; i--){
            char character = expression.charAt(i);

            if(Character.isDigit(character)){
                double val = Double.parseDouble(String.valueOf(character));
                stack.push(val);
            } else {
                if(character == '+'){
                    double value1 = stack.pop();
                    double value2 = stack.pop();
                    stack.push(value1 + value2);
                }
                if(character == ('-')){
                    double value1 = stack.pop();
                    double value2 = stack.pop();
                    stack.push(value1 - value2);
                }

                if(character == '*'){
                    double value1 = stack.pop();
                    double value2 = stack.pop();
                    stack.push(value1 * value2);
                }

                if(character == '/'){
                    double value1 = stack.pop();
                    double value2 = stack.pop();
                    stack.push(value1 / value2);
                }
            }
        }
        return stack.pop();


    }
}
