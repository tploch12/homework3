import java.util.Scanner;

public class HW3_5 {
    private int dayNum;

    public String printDay(int dayNum) {
            switch (dayNum) {
                case 1: return "Monday";
                case 2: return "Tuesday";
                case 3: return "Wednesday";
                case 4: return "Thursday";
                case 5: return "Friday";
                case 6: return "Saturday";
                case 7: return "Sunday";
                default: return "Invalid day";
        }
            }

            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day number: ");
        int dayNum = input.nextInt();
        HW3_5 obj = new HW3_5();
        String result = obj.printDay(dayNum);
        System.out.println(result);

            }

}
