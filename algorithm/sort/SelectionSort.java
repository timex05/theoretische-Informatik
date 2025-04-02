package algorithm.sort;
import java.util.Arrays;

public class SelectionSort implements IntSorter {

    @Override
    public int[] sort(int[] numbers) {
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i; j < numbers.length; j++){
                if(numbers[j] < numbers[i]){
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        IntSorter is = new SelectionSort();
        int[] numbers = {6,9,2,5,1,0,3,7,8,4};
        Arrays.stream(is.sort(numbers)).forEach(x -> System.out.print(x + " | "));
    }

}
