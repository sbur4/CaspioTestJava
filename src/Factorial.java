/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class Factorial {
    public static void main(String args[]) {
        int i, fact = 1;
        int number = 5;// It is the number to calculate factorial => 5! = 5*4*3*2*1 = 120
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}