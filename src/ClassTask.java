import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num;
        do {
            System.out.println("Please enter a positive number: ");
            num = input.nextInt();
        }
        while (num < 0);
        System.out.println("Thank you. You entered: " + num);
    }
}