import java.util.Scanner;

public class HW3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days overdue is your book?: ");
        int days = sc.nextInt();
        double charge = 0;
        if (days > 0) {
            if (days <= 5) {
                charge = days * 1;
            }
            else if (days >= 6 && days <= 10) {
                charge = days * 1.5;
            }
            else if (days >= 11) {
                charge = days * 2;
            }
        } else {
            System.out.println("Days cannot be less than 0");
        }
        if (charge > 30) {
            charge = 30;
            System.out.println("You have hit the max charge, you owe: $30");
        }
        System.out.println("Charge is: $" + charge);
    }
}
