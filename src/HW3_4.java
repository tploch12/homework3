public class HW3_4 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

                if (i % 10 == 0) {
                    System.out.println("Reached a multiple of 10");
                }
            }

        }
    }
}
