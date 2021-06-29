public class Rectangle extends Shape {
    private float length;
    private float width;

    public Rectangle(String pName, float pLength, float pWidth) {
        super(pName);
        this.length = pLength;
        this.width = pWidth;
    }

    public void printDetails() {
        System.out.println("Name = " + name);
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}
