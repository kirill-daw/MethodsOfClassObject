import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    public String getCustomer() {
        return customer;
    }

    public Product[] getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "Заказ[клиент=" + customer + ", корзина=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order order = (Order) obj;

        if (!Objects.equals(customer, order.customer)) {
            return false;
        }

        if (basket == null && order.basket == null) {
            return true;
        }
        if (basket == null || order.basket == null) {
            return false;
        }
        if (basket.length != order.basket.length) {
            return false;
        }

        for (int i = 0; i < basket.length; i++) {
            Product p1 = basket[i];
            Product p2 = order.basket[i];

            if (p1 == null && p2 == null) {
                continue;
            }
            if (p1 == null || p2 == null) {
                return false;
            }
            if (!p1.equals(p2)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, Arrays.hashCode(basket));
    }
}