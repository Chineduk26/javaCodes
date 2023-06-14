import java.util.Scanner;

public class GradePrinter1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score: ");
        short score = scan.nextShort();
        scan.close();

        String grade = gradeRead(score);
        System.out.println("The grade is: " + grade);
    }

    public static String gradeRead(short score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score < 90) {
            return "B";
        } else if (score >= 70 && score < 80) {
            return "C";
        } else if (score >= 60 && score < 70) {
            return "D";
        } else if (score >= 0 && score < 60) {
            return "F";
        } else {
            return "Invalid score. Please enter a score between 0 and 100.";
        }
    }
}