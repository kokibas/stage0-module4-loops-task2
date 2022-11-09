package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        if (power >= i) {
            while (power >= i) {
                power = power * i;
                i++;
                System.out.println(power);
            }
        }
        else {
            while (power <= i) {
                power = power * i;
                i++;
                System.out.println(power);
            }
        }
    }
}
