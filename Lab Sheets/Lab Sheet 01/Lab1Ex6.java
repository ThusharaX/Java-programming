/* Write a program that draws the following figures one next the other.
    
    * * * * *       *
    * * * * *      * *
    * * * * *     * * *
    * * * * *    * * * *
    * * * * *   * * * * *

*/

class Lab1Ex6 {
    public static void main(String[] args) {

        int column = 0;
        int raw = 0;

        for(column = 1; column <= 5; column++) {
            for(raw = 0; raw < 5; raw++) {
                System.out.print("* ");
            }

            System.out.print("\t");

            for(raw = 0; raw < 5 - column; raw ++) {
                System.out.print(" ");
            }

            for(raw = 0; raw < column; raw ++) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }
    }
}

// </Thushara Thiwanka>