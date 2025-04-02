package algorithm.algorithmplay;


public class AlgorithmDefinition {

    

    public boolean AlgDeterministicAndDetermined(int i){
        
        int b = i + 2;
        return b > 3;

        // finit: Ja, 3 Anweisungen. Ja, weil 37 Zeichen.
        // deterministisch: Ja, nirgendwo eine Wahl. 
        // determiniert: Ja, wenn finit + deterministisch -> determiniert


    }

    public boolean TextDetermined(int i){
        
        int b = i + 2;
        long l = System.nanoTime();
        System.out.println(l);
        return b > 3;

        // finit: Ja ...
        // deterministisch: Nein, random Zustand
        // determiniert: Gleiche Eingabe, Gleiche Ausgabe.

    }

    public boolean AlgNotTerminates(int i){
        
        int b = i + 2;
        // while (true) 
        //     System.out.println("Ich höre nie auf");
        

        return b > 3;

        // finit: Ja, 3 Anweisungen. Ja, weil 37 Zeichen.
        // deterministisch: Ja, nirgendwo eine Wahl. 
        // determiniert: Ja, wenn finit + deterministisch -> determiniert
        // terminiert nicht

        
    }

}
