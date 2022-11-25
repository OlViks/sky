package pro.sky.java.src.set.products;

import java.util.Objects;

public class Product {

    private final String name;

    private final float price;

    private final int quantity;

    private boolean boughtCheck;

    public Product(String name, float price, int quantity) {
        if (name == null || name.isBlank() || price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.boughtCheck = false;
    }

    public boolean isBoughtCheck() {
        return boughtCheck;
    }

    public void setBoughtCheck() {
        this.boughtCheck = true;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String boughtCheckString = this.isBoughtCheck() ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Количество: %s, Купелен, %s",
                this.name,this.price,
                this.quantity,boughtCheckString);
    }
}
