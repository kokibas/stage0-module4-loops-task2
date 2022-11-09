package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive ) {

        int i = 0;
        if (printTillInclusive % 2 == 0){
            while (printTillInclusive >= i){

                i++;System.out.println(printTillInclusive);
            }
        }
    }
}
