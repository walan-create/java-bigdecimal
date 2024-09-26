package Ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

enum UserState {
    NEW, ACTIVE, BLOCKED, BANNED
}
enum OrderStatus {
    NEW, HOLD, SHIPPED, DELIVERED, CLOSED
}

public class OnlineShopping {

    public static class WebUser {
        private String loginId;
        private String password;
        private UserState state;

        public WebUser(String loginId, String password, UserState state) {
            this.loginId = loginId;
            this.password = password;
            this.state = state;
        }
        public String getLoginId() {
            return loginId;
        }
        public void setLoginId(String loginId) {
            this.loginId = loginId;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public UserState getState() {
            return state;
        }
        public void setState(UserState state) {
            this.state = state;
        }
    }

    public static class Customer {
        private String id;
        private String address;
        private String phone;
        private String email;

        public Customer(String id, String address, String phone, String email) {
            this.id = id;
            this.address = address;
            this.phone = phone;
            this.email = email;
        }

    }

    public static class Account {
        private String id;
        private String billingAddress;
        private boolean isClosed;
        private LocalDate open;
        private LocalDate closed;

        public Account(String id, String billingAddress, boolean isClosed, LocalDate open, LocalDate closed) {
            this.id = id;
            this.billingAddress = billingAddress;
            this.isClosed = isClosed;
            this.open = open;
            this.closed = closed;
        }
    }

    public static class Product {
        private String id;
        private String name;
        private String supplier;
        private BigDecimal price;

        public Product(String id, String name, String supplier, BigDecimal price) {
            this.id = id;
            this.name = name;
            this.supplier = supplier;
            this.price = price;
        }
        public BigDecimal getPrice() {
            return price;
        }
        public void setPrice(BigDecimal price) {
            this.price = price;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ShoppingCart {
        private List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        public BigDecimal getTotal() {
            BigDecimal total = BigDecimal.ZERO;
            for (Product product : products) {
                total = total.add(product.getPrice());
            }
            return total.setScale(2, RoundingMode.HALF_UP);
        }

        public List<Product> getProducts() {
            return products;
        }
    }

    public static class Order {
        private String number;
        private LocalDate ordered;
        private LocalDate shipped;
        private String shipTo;
        private OrderStatus status;
        private BigDecimal total;

        public Order(String number, LocalDate ordered, LocalDate shipped, String shipTo, OrderStatus status, BigDecimal total) {
            this.number = number;
            this.ordered = ordered;
            this.shipped = shipped;
            this.shipTo = shipTo;
            this.status = status;
            this.total = total;
        }

        public BigDecimal getTotal() {
            return total;
        }
    }

    public static class Payment {
        private String id;
        private LocalDate paid;
        private BigDecimal total;
        private String details;

        public Payment(String id, LocalDate paid, BigDecimal total, String details) {
            this.id = id;
            this.paid = paid;
            this.total = total;
            this.details = details;
        }

        public BigDecimal getTotal() {
            return total;
        }
    }

}
