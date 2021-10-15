public class Car{

    private int speed;
    protected double reqularPrice;
    private String color;
    protected double SalePrice;


    public Car() {

        speed =0;
        reqularPrice = 0;
        color = "null";
        SalePrice = 0;
    }

    public Car(int speed,double reqularPrice,String color, double SalePrice)  {

            this.speed = speed;
            this.reqularPrice = reqularPrice;
            this.color = color;
            this.SalePrice = SalePrice;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public int getSpeed() {

        return speed;
    }

    public void setRequestularPrice(double reqularPrice) {

            this.reqularPrice = reqularPrice;
    }

    public double getRequestularPrice() {

        return reqularPrice;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }


    public double getSalePrice() {

        return reqularPrice;
    }

    public void setSalePrice(double SalePrice) {

        this.salePrice = SalePrice;
    }

    public double get() {

        return SalePrice;
    }

}



