 import java.util.Scanner;

public class GradeScore1 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        System.out.println("Enter your score: ");
        short score = pr.nextShort();
// all
        if (score >= 0 && score <= 39) {
            System.out.println("Your grade is F");
        } else if (score >= 40 && score <= 44) {
            System.out.println("Your grade is E");
        } else if (score >= 45 && score <= 49) {
            System.out.println("Your grade is D");
        } else if (score >= 50 && score <= 59) {
            System.out.println("Your grade is C");
        } else if (score >= 60 && score <= 79) {
            System.out.println("Your grade is B");
        } else if (score >= 80 && score <= 100) {
            System.out.println("Your grade is A");
        } else {
            System.out.println("Invalid score");
        }
    }
}
