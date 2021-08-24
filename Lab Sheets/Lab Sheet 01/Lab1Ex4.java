/*  Write a program to display the day of the week when you provide the value.
        Expected Output:
            Value of the day : 4
            Day of the week : Thursday
            Good Bye!
    
    You must use “switch –case” statement.
    Display “Invalid Day” when some invalid value is provided.
    Message “Good Bye” must appear at last
*/

class Lab1Ex4 {
    public static void main(String[] args) {

        int dayNumber = 4;
        String day;

        System.out.println("Value of the day : " + dayNumber);

        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;

            default:
                day = "Invalid Day";
        }

        System.out.println("Day of the week : " + day);

        System.out.println("Good Bye!");
    }
}

// </Thushara Thiwanka>