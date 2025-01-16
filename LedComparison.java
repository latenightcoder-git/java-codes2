class Led {
    private int id;
    private String brand;
    private double price;
	
	public Led(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
	
	public String toString() {
        return "LED [ID: " + id + ", Brand: " + brand + ", Price: $" + price + "]";
    }
}

public class LedComparison {
    public static void main(String[] args) {
        Led sony = new Led(1, "Sony", 1500);
        Led samsung = new Led(2, "Samsung", 1800);

        if (sony.getPrice() > samsung.getPrice()) {
            sony.setBrand("Premium Model");
        } else {
            samsung.setBrand("Premium Model");
        }

        System.out.println(sony);
        System.out.println(samsung);
    }
}