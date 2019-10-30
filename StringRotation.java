/**
 * Check if a string is a rotation of another
 */

public class StringRotation {

    public static void main(String[] args) {
        // Test strings
        String str1 = "ABCD";
        String str2 = "CDAB";
        // ABCDABCD contains all rotations of ABCD!
        boolean rotation = (str1 + str1).contains(str2);
        System.out.println(str2 + " is a rotation of " + str1 + "? " + rotation); // true
    }
}
