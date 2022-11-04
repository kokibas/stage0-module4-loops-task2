package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 1;
        int i = 0;
        while (i <= printToInclusive){
            result = result * i;
        }
        System.out.println(result);

    }
}
