package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int even = 0;
        if (even % 2 == 0){
            while (printTillInclusive >= even){
                System.out.println(even);
                even++;
            }
        }
        else {
            System.out.println("odd");
        }
    }
}
