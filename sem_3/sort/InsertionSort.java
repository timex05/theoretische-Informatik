package sem_3.sort;

import java.util.Arrays;

public class InsertionSort implements IntSorter{

    @Override
    public int[] sort(int[] numbers) {
        int[] out = new int[numbers.length];
        int size = 0;

        for (int num : numbers) {
            int j = size;
            while (j > 0 && out[j - 1] > num) {
                j--;
            }
            shiftRight(out, j, size);
            out[j] = num;
            size++;
        }
        return out;
    }
    

    private void shiftRight(int[] numbers, int index, int size) {
        for (int i = size; i > index; i--) {
            numbers[i] = numbers[i - 1];
        }
    }

    public static void main(String[] args) {
        IntSorter is = new InsertionSort();
        int[] numbers = {6,9,2,5,1,0,3,7,8,4};
        Arrays.stream(is.sort(numbers)).forEach(x -> System.out.print(x + " | "));
    }

}
