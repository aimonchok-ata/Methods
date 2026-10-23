import java.util.Scanner;

public class StudentGrader {

    // gives a letter grade for a score
    // if the score is not between 0 and 100, it gives back "Invalid".
    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid";
        }

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the score (0-100): ");
        int score = input.nextInt();

        String grade = calculateGrade(score);

        if (grade.equals("Invalid")) {
            System.out.println("Invalid score! It must be between 0 and 100.");
        } else {
            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade);
        }
    }
}
