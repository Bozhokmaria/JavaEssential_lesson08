package task2;

public class Price {
    String item;
    String shop;
    double price;

    public Price(String item, String shop, double price) {
        this.item = item;
        this.shop = shop;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public String getShop() {
        return shop;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product " + item + '\'' +
                ", shop='" + shop + '\'' +
                ", price=" + price + " hrn";
    }
}
