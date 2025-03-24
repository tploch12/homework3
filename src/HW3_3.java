import java.util.Scanner;

public class HW3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter students GPA: ");
        double gpa = input.nextDouble();
        System.out.println("Numbner of credits: ");
        int credits = input.nextInt();
        input.nextLine();
        System.out.println("Honors list? (Y/N):");
        String honor = input.nextLine();
        boolean honors = honor.equals("Y");
        String scholorship = "False";

        if (gpa >= 3.5 && (credits >= 30 || honors)) {
            scholorship = "True";
        } else {
            scholorship = "False";
        }
    System.out.println("Scholorship: " + scholorship);
    }
}
