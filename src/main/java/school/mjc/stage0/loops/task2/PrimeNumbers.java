package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (printToInclusive >= i){
            if (i % 2 == 0){

                i++;
            } else {
                System.out.println(i);
                i++;
            }
            i++;
        }
    }
}
