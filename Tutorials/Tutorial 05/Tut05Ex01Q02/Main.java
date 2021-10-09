// The Following code would generate some Exceptions. Identify the Exception. Extend the
// code and handle all Exceptions.

class Main {
    static int divide(String s1[]) {
        int x, y;

        x = Integer.parseInt(s1[0]);
        y = Integer.parseInt(s1[1]);

        return x / y;
    }

    public static void main(String args[]) {
        String a[] = { "10", "0" };

        try {
            System.out.println(a[0] + "/" + a[1] + " = " + divide(a));
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
