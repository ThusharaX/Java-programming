public class MutipleCatch {
 
        public static void main(String args[]) {

            try{

              //  int a = args.length;
              //  System.out.println("a = " +a);
              //  int b =42 /a;
                int c[] = {1};
                c[42] = 99;

            } catch (ArithmeticException e3) {

                System.out.println("Divide by 0 :" +e);
            }catch (ArrayIndexOutOfBoundsException ex) {

                System.out.println("Array index oob :" +ex);
            }


                System.out.println("After try/ catch block");
        }



}
