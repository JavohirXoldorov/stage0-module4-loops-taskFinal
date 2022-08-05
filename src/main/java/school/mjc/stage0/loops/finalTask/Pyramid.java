package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            int cnt = i, k = cathetusLength - i, sign = -1;
            for (int j = 0; j < 2 * cathetusLength - 1; j++) {
                if (k-- > 0) {
                    System.out.print(" ");
                } else {
                    if (cnt > i) {
                        System.out.print(" ");
                        continue;
                    }
                    System.out.print(cnt);
                    cnt += sign;
                    if (cnt == 0) {
                        cnt = 2;
                        sign *= -1;
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(8);
    }
}
