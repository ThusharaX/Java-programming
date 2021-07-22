public class Lab2Ex1 {
    public static void main(String[] args) {
        int miles, yards;
        double kilometers;
        miles = 26;
        yards = 365;

        kilometers = (miles * 1.609) + (yards * 1.609 / 1760);
        System.out.println("Kilometers: " + kilometers);
    }
}