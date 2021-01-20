package Practice;

    import java.util.Scanner;

    public class Project1 {

        public static void main(String[] args) {
            int number;
            String choice;
            Scanner input = new Scanner(System.in);

            System.out.println("choose number >0 and <10");
            number = input.nextInt();
            System.out.println("a-) addition  :");
            System.out.println("b-) division :");
            System.out.println("c-) multiplication :");
            System.out.println("d-) substraction :");
            System.out.println("e-) factorial :");

            choice = input.next();
            if (number >= 0 & number <= 10) {
                System.out.println("condition right");

                choice(number, choice);

            } else {
                System.out.println("choose number >0 and <10");

                System.out.println("choose other operation");
            }

        }

        public static  int addition(int num) {
            int some = 0;
            for (int i = 0; i <= 10; i++) {
                some = num + i;
                System.out.println("Result of " + num + "+" + i + "=" + some);
            }
            space();
            return some;
        }

        public static void div(int num) {
            int div;
            System.out.println("number "+num+"can't be divide by 0" );

            for (int i = 1; i <= 10; i++) {
                div = num / i;
                System.out.println("Result of " + num + "/" + i + "=" + div);
            }
            space();

        }

        public static void mul(int num) {
            int mul;
            for (int i = 0; i <= 10; i++) {
                mul = num * i;
                System.out.println("Result of " + num + "*" + i + "=" + mul);
            }
            space();
        }

        public static void sus(int num) {
            int sus;
            for (int i = 0; i <= 10; i++) {
                sus = num - i;
                System.out.println("Result of " + num + "-" + i + "=" + sus);
            }
            space();
        }
        public static void fact(int num) {
            int fact=1;
            for (int i = 1; i <=  num; i++) {
                fact = fact *i;

            }System.out.print("Result of factorial " + num +  "! =" + fact);
            space();
        }
        public static void space() {
            System.out.println("");
            System.out.println("");

            System.out.println("-------**--End--**-----");

        }

        public static void choice(int number, String choice) {

            switch (choice) {
                case "a":
                    addition(number);
                    break;
                case "b":
                    div(number);

                    break;
                case "c":
                    mul(number);

                    break;
                case "d":
                    sus(number);
                    break;
                case "e":
                    fact(number);
                    break;
            }
        }

    }

