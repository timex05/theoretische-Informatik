package sem_2.search;

public class HashSearcher implements IntSearcher {

    int[] hashStorage;

    public boolean fill(int[] numbers, final int LIMIT){

        hashStorage = new int[LIMIT];
        for(int i = 0; i < LIMIT; i++){
            hashStorage[i] = 0;
        }
        for(int number : numbers){
            int pos = number % LIMIT;
            
            while(hashStorage[pos] != 0){
                pos = (pos+1) % LIMIT;
            }

            hashStorage[pos] = number;
        }


        return false;
    }

    @Override
    public boolean find(int elementToFind, int[] numbers) {
        return false;
    }


}
