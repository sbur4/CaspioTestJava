import java.util.Scanner;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

class Palindrome {
    // okko

    public static void main(String[] args) {

        String str, revStr = "";
        Scanner scnrN = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = scnrN.nextLine();

        int length = str.length();
        for (int i = length - 1; i >= 0; i--)
            revStr = revStr + str.charAt(i);

        if (str.equals(revStr))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");

        scnrN.close();
    }
}
