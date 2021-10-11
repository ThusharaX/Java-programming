public class Date{ // Date Class
 
    // Attributes of Date Class
    private int month;
    private int day;
    private int year;

    public Date() { // Default Constructer of Date Class

        month = 0;
        day = 0;
        year =0 ;

    }

    public Date(int month, int day, int year) { // Overload Constructer of Date Class

        this.month = month;
        this.day = day;
        this.year = year;

    }

    public void setMonth(int month) { // Set method for month

        this.month = month;

    }
    public int getMoth() { // get method for month

        return month; // return month value
    }

    public void setDay(int day) { // Set method for date

        this.day = day;
    }

    public int getDay() { // get method for date

        return day; // return day value
    }

    public void setYear(int year) { // Set method for year

        this.year = year;
    }

    public int getYear() {  // get method for year

        return year; // return day value
    }

    public void DisplyDate() {  // Method for display date

        System.out.println(+month+ "/" +day+ "/" + year); // Display month dat and year


    }

}