package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        if (printTillInclusive % 2 == 0){
            while (printTillInclusive >= 0){
                System.out.println(printTillInclusive);
                printTillInclusive++;
            }
        }
    }
}
