public class Sedan extends Car{

    private int length;

    public Sedan() {};

    public Sedan(int speed,double reqularPrice,String color, double SalePrice,int length) {

        super(speed,reqularPrice,color,SalePrice);
        this.length = length;
    }

    public void setLength(int length) {


        this.length = length;
    }

    public int getLength() {

        return length;
    }

    public double getSalePrice() {

        if (length > 20) {

            SalePrice = reqularPrice * 5/100;

            return SalePrice;   
        }
        else {

            SalePrice = reqularPrice * 5/100;

            return SalePrice;
        }
    }

}