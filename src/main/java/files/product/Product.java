package files.product;

public class Product {

    private static Product product;
    private int id;
    private String name;
    private float price;

    private Product(int id) {
        this.id = id;
        name = "Product_Test";
        price = (float) 25.65;
    }

    public static Product getProduct(int id) {
        if (product == null) {
            product = new Product(id);
        }
        return product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
