/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

class Fibonacci {

    public static void main(String[] args) {
        int numConst1 = 0;
        int numConst2 = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(numConst1 + " ");
            numConst1 = numConst1 + numConst2;
            numConst2 = numConst1 - numConst2;
        }
        System.out.println();
    }
}
