package sem_2.search;

public class LinearSearch implements IntSearcher {

    @Override
    public boolean find(int elementToFind, int[] numbers) {
        boolean found = false;
        int i = 0;
        while(!found && i < numbers.length){
            if(numbers[i] == elementToFind) found = true;
            i++;
        }
        return found;
    }
    
}
