package Practice;

public class Z {
    public static void main(String[] args) {
Z z=new Z();
        z.z();
  z.O();
  z.O();
    }

  public  void z()
    {
        int val = 3;
        for (int i = 0; i <= val; i++) {
            System.out.print("* ");}System.out.println("* ");

        for (int i = 1; i <= val; i++) {

            for (int k = val; k >= i; k--) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i <= val; i++) {
            System.out.print("* ");} System.out.print("* ");
        System.out.println("");
    }
   public  void O(){

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
       System.out.println("");


   }


    }








