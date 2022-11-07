package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        if (i % 2 !=0){
            while ((printToInclusive + 1) >= i){
                i++;System.out.println(printToInclusive);
            }

        }

    }
}
