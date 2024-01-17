package Loops;

public class PatternProgram {
    public static void main(String[] args) {
        int n = 5; // Number of lines

        for (int i = n; i >= 1; i--) {
            // Print '+' characters
            for (int j = 1; j <= n - i; j++) {
                System.out.print("+");
            }

            // Print '-' characters
            for (int k = 1; k <= i; k++) {
                System.out.print("-");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

