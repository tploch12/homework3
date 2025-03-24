import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine();
        int length = sentence.length();
        System.out.println("The length of the sentence is: " + length);
        String upper = sentence.toUpperCase();
        System.out.println(upper);
        String underscore = sentence.replace(" ", "_");
        System.out.println(underscore);
        String substring = sentence.substring(3,11);
        System.out.println(substring);
    }
}