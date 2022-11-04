package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int result ;
        if (power < 0 ){
            System.out.println("too much power");

        }
        while (power >= 0) {
            result = 2 * power;
            power++;
            System.out.println(result);
        }
    }
}
