/**
 * A number is called an Armstrong number if it is equal to the cube of its
 * every digit. For example, 153 is an Armstrong number because of 153= 1+
 * 125+27, which is equal to 1^3+5^3+3^3. You need to write a program to check
 * if the given number is Armstrong number or not.
 */

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class ArmstrongNumber {
    public static void main(String[] args) {

        int mainNum = 153;
        double chekNum = Math.pow(1, 3) + Math.pow(5, 3) + Math.pow(3, 3);
        // int chekNum = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3;
        // System.out.println(chekNum);
        if (mainNum == chekNum) {
            System.out.println("It's Armstrong number");
        } else {
            System.out.println("It's not Armstrong number");
        }
    }

}
