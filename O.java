package Practice;

public class O {

    public static void main(String[] args) {
        int val = 3;
        for (int i = 0; i <= val; i++) {
            System.out.print(" *");
        }
        System.out.println("  ");

        for (int i = 1; i <= val; i++) {
            System.out.print("*");

            for (int k = 0; k <= val+3; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i <= val; i++) {
            System.out.print(" *");
        }
        System.out.print("  ");


    }
}