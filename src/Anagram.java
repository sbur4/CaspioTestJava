import java.util.Arrays;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class Anagram {
    public static void main(String[] args) {
        String x = "JAVA";
        String y = "AVAJ";

        char a[] = x.toCharArray();
        char b[] = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        Boolean result = Arrays.equals(a, b);

        if (result == true) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings aren't Anagram");
        }

    }
}
