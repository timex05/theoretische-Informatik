package sem_3.sort;

import java.util.Arrays;

public class BubbleSort implements IntSorter{

    @Override
    public int[] sort(int[] numbers) {
        
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = 0; j < numbers.length -i -1; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }

        }
        return numbers;
    }

    public static void main(String[] args) {
        IntSorter bs = new BubbleSort();
        int[] numbers = {6,9,2,5,1,0,3,7,8,4};
        Arrays.stream(bs.sort(numbers)).forEach(x -> System.out.print(x + " | "));
    }

}
