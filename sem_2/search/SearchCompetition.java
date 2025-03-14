package sem_2.search;

import java.util.Arrays;
import java.util.Random;

public class SearchCompetition {
    
    public static void main(String[] args) {
        IntSearcher linearSearch = new LinearSearch();
        IntSearcher logarithmicSearch = new LogarithmicSearch();
        IntSearcher hashSearch = new HashSearcher();

        Random r = new Random();

        final int LIMIT = 100000;
        int[] numbersLS = new int[LIMIT];
        int[] numbersLogS = new int[LIMIT];
        int[] numbersHash = new int[LIMIT];
        for(int i = 0; i < LIMIT; i++){
            numbersLS[i] = r.nextInt(1, 10_000_000);
            numbersLogS[i] = numbersLS[i];
            numbersHash[i] = numbersLS[i];
        }

    

        

        // numbersLS[13] = 234;
        // numbersLogS[13] = 234;
        // numbersHash[13] = 234;

        Arrays.sort(numbersLogS);
        
        
        // System.out.println("Numbers");
        // Arrays.stream(numbersLS).forEach(System.out::println);

        // System.out.println("linear Searh");
        // System.out.println("Find Element: 234: " + linearSearch.find(234, numbersLS));

        // System.out.println("Numbers");
        // Arrays.stream(numbersLogS).forEach(System.out::println);
        // System.out.println("logarithmic Search");
        // System.out.println("Find Element: 234: " + logarithmicSearch.find(234, numbersLogS));

        long t1 = System.nanoTime();

        System.out.println(linearSearch.find(234, numbersLS));

        long t2 = System.nanoTime();

        System.out.println("Linear: " + (t2-t1));


        t1 = System.nanoTime();

        System.out.println(logarithmicSearch.find(234, numbersLogS));

        t2 = System.nanoTime();

        System.out.println("Logarithmic: " + (t2-t1));


        t1 = System.nanoTime();

        System.out.println(hashSearch.find(234, numbersLogS));

        t2 = System.nanoTime();

        System.out.println("Hash: " + (t2-t1));






    }
}
