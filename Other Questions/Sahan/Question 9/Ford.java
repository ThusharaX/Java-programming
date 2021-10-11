public class Ford extends Car{

    private int year;
    private int manufacturerDiscount;
    
    public Ford() {

        
        year = 0;
        manufacturerDiscount = 0;

    }

    public Ford(int speed,double reqularPrice,String color, double SalePrice, int year, int manufacturerDiscount) {

        super(speed,reqularPrice,color,SalePrice,);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;

    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getYear() {

        return year;
    }
    public void setManufacturerDiscount(int manufacturerDiscount) {

        this.manufacturerDiscount = manufacturerDiscount;
    }

    public int getManufacturerDiscount() {

        return manufacturerDiscount;
    }

    public double getSalePrice() {

        return salePrice;
    }
}