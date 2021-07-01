package files.product;

import org.apache.commons.lang3.RandomStringUtils;

public class ProductOld {

    private int id;
    private String name;
    private float price;

    public ProductOld(int id) {
        this.id = id;
        name = RandomStringUtils.random(5, true, false);
        price = (float) (Math.random()*50);
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
