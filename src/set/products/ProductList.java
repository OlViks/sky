package pro.sky.java.src.set.products;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {

    private final Set<Product> products = new HashSet<>();

    public void addProducts(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new ProductAlreadyExistsException("Такой продукт есть! ");
        } else {
            this.products.add(product);
        }
    }

    public void checkProduct(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                product.setBoughtCheck();
                break;
            }
        }
    }


    public void remove(String name) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getName().equals(name)) {
                productIterator.remove();
                break;
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов: ").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }

}
