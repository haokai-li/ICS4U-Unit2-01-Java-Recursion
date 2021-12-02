/*
* The "Reverse the string" program, just proves you can show print to terminal.
*
* @author  Haokai
*
* @version 1.0
*
* @since   2021-12-01
*
*/

import java.util.Scanner;

/**
* This is the standard "Reverse the string" program.
*/
final class Recursion {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Recursion() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting calculate function.
    *
    * @param originalString
    *
    * @return calculate
    */

    static String reverseProcess(final String originalString) {
        final String answer;
        if (originalString.isEmpty()) {
            answer = originalString;
        } else {
            answer = reverseProcess(
                originalString.substring(1)) + originalString.charAt(0);
        }
        return answer;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        try {
            // input
            final Scanner input = new Scanner(System.in);
            System.out.print("The original string is : ");
            final String originalString = input.nextLine();

            final String reverse = reverseProcess(originalString);

            System.out.println(
                "The reversed string (using recursion) is : " + reverse);

        } catch (java.util.InputMismatchException errorCode) {
            System.out.println("Something was not a number.");
        }
        System.out.println("\nDone.");
    }
}

