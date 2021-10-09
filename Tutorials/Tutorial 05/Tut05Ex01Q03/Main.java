import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner myscanner = new Scanner(System.in);
        int size;
        int count = 0;
        int total = 0;
        float avg;

        System.out.println("Enter size of data : ");
        size = myscanner.nextInt();

        int data[] = new int[size];
        int index;

        System.out.print("Enter Index : ");
        index = myscanner.nextInt();

        while (index != -1) {
            System.out.print("Enter a marks : ");

            try {
                data[index] = myscanner.nextInt();
                count++;

                try {
                    total += data[index];
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

            System.out.print("Enter Index : ");
            index = myscanner.nextInt();
        }

        for (int r = 0; r < size; r++)
            System.out.println(r + " - " + data[r]);

        avg = (float) total / count;

        System.out.println("Average : " + avg);

        myscanner.close();
    }
}