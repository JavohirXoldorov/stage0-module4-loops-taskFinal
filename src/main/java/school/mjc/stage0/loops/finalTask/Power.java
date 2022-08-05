package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int p = 1;
        for (int i = 0; i < power; i++) {
            p *= numberToPrint;
        }
        System.out.println(p);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
