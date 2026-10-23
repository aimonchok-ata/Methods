import java.util.Scanner;

public class NumberPatternGenerator {

    // 1 Right Triangle
    public static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2 Inverted Right Triangle
    public static void printInvertedRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 3 Pyramid
    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4 Inverted Pyramid
    public static void printInvertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5 Number Triangle (1, 12, 123, ...)
    public static void printNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size! The number of rows must be at least 1.");
            return;
        }

        System.out.println("Choose the pattern type:");
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.println("5 - Number Triangle");
        System.out.print("Your choice: ");
        int choice = input.nextInt();

        System.out.println();
        System.out.println("Size: " + size);

        if (choice == 1) {
            System.out.println("Pattern: Right Triangle");
            printRightTriangle(size);
        } else if (choice == 2) {
            System.out.println("Pattern: Inverted Right Triangle");
            printInvertedRightTriangle(size);
        } else if (choice == 3) {
            System.out.println("Pattern: Pyramid");
            printPyramid(size);
        } else if (choice == 4) {
            System.out.println("Pattern: Inverted Pyramid");
            printInvertedPyramid(size);
        } else if (choice == 5) {
            System.out.println("Pattern: Number Triangle");
            printNumberTriangle(size);
        } else {
            System.out.println("Invalid choice! Please choose a number from 1 to 5.");
        }
    }
}