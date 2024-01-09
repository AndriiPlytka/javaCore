package lab4;
import java.util.Objects;

public abstract class AbstractProduct implements Exportable {
    // Поля класу
    protected String productName;
    protected int quantity;
    protected double price;

    // Конструктор
    public AbstractProduct(String productName, int quantity, double price) {
        this.productName = productName;
        if (quantity < 0.0 || quantity > MAX_QUANTITY) {
            System.out.println("Error: The quantity must be greater than 0 and lower than 1000");
        } else {
            this.quantity = quantity;
        }
        if (price < 0.0) {
            System.out.println("Error: The price must be greater than or equal to 0.0.");
        } else {
            this.price = price;
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0.0) {
            System.out.println("Error: The quantity must be greater than or equal to 0.");
        } else {
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Неабстрактний метод
    public double calcAmount() {
        return this.quantity * this.price;
    }

    public abstract void displayProduct();

    public abstract void displayProductInUpperCase();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractProduct that = (AbstractProduct) o;
        return quantity == that.quantity && Double.compare(that.price, price) == 0 && Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, quantity, price);
    }

    @Override
    public String toString() {
        return  "productName='" + productName + '\'' +  "\n"+
                "quantity=" + quantity +  "\n"+
                "price=" + price +  "\n";
    }
}





