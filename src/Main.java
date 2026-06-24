public class Main {
    public static void main(String[] args) {
        System.out.println("ТЕСТИРОВАНИЕ ТОВАРОВ");
        testProducts();

        System.out.println("\nТЕСТИРОВАНИЕ ЗАКАЗОВ");
        testOrders();
    }

    public static void testProducts() {
        Product product1 = new Product(1, "Ноутбук", 75000, "Электроника");
        Product product2 = new Product(2, "Смартфон", 50000, "Электроника");
        Product product3 = new Product(1, "Планшет", 30000, "Электроника");
        Product product4 = new Product(3, "Наушники", 5000, "Аксессуары");
        Product product5 = new Product(1, "Монитор", 25000, "Электроника");

        System.out.println("Товар 1: " + product1);
        System.out.println("Товар 2: " + product2);
        System.out.println("Товар 3: " + product3);
        System.out.println("Товар 4: " + product4);
        System.out.println("Товар 5: " + product5);

        System.out.println("\nРезультаты сравнения:");
        System.out.println("product1 equals product1: " + product1.equals(product1));
        System.out.println("product1 equals product2: " + product1.equals(product2));
        System.out.println("product1 equals product3: " + product1.equals(product3));
        System.out.println("product1 equals product4: " + product1.equals(product4));
        System.out.println("product1 equals product5: " + product1.equals(product5));
    }

    public static void testOrders() {
        Product phone = new Product(1, "Смартфон", 50000, "Электроника");
        Product laptop = new Product(2, "Ноутбук", 75000, "Электроника");
        Product headphones = new Product(3, "Наушники", 5000, "Аксессуары");
        Product charger = new Product(4, "Зарядка", 1500, "Аксессуары");

        Product[] basket1 = {phone, laptop, headphones};
        Product[] basket2 = {phone, laptop, headphones};
        Product[] basket3 = {phone, laptop, charger};
        Product[] basket4 = {phone, headphones, laptop};

        Order order1 = new Order("Иван Петров", basket1);
        Order order2 = new Order("Иван Петров", basket2);
        Order order3 = new Order("Иван Петров", basket3);
        Order order4 = new Order("Мария Сидорова", basket1);
        Order order5 = new Order("Иван Петров", basket4);

        System.out.println("Заказ 1: " + order1);
        System.out.println("Заказ 2: " + order2);
        System.out.println("Заказ 3: " + order3);
        System.out.println("Заказ 4: " + order4);
        System.out.println("Заказ 5: " + order5);

        System.out.println("\nРезультаты сравнения:");
        System.out.println("order1 equals order1: " + order1.equals(order1));
        System.out.println("order1 equals order2 (одинаковые корзина и клиент): " + order1.equals(order2));
        System.out.println("order1 equals order3 (разные товары в корзине): " + order1.equals(order3));
        System.out.println("order1 equals order4 (разные клиенты): " + order1.equals(order4));
        System.out.println("order1 equals order5 (одинаковые товары, но другой порядок): " + order1.equals(order5));
    }
}