package persewaan;

//superclass
public class Product {
    protected int number;
    protected String name;
    protected int Quantity;
    protected double price;

    public Product() {
        number = 0;
        name = "Product 0";
        Quantity = 0;
        price = 0.0;
    }

    public Product(int number, String name, int Quantity, double price) {
        this.number = number;
        this.name = name;
        this.Quantity = Quantity;
        this.price = price;
    }

    public void print() {
        System.out.println("Number = "+ number);
        System.out.println("Nama = "+ name);
        System.out.println("quantity = "+ Quantity);
        System.out.println("Harga = "+ price);
    }
}
