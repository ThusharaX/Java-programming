public class Truck extends Car{

    private int weight;

    public Truck() {

        weight = 0;
    }

    public Truck(int speed,double reqularPrice,String color, double SalePrice, int weight) {

        super(speed, reqularPrice, color, SalePrice);
        this.weight = weight;

    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getWeight() {

        return weight;
    }


    public double getSalePrice() {

        if(weight >2000) {

        SalePrice = reqularPrice * 10/100;

         return SalePrice;
     }

     else {

        SalePrice = reqularPrice * 20/100;

        return SalePrice;
     }

    }
}