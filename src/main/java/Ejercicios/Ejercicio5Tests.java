package Ejercicios;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Ejercicio5Tests {
    @Test
    public void testCreateWebUserCustomerAccount() {
        OnlineShopping.WebUser user = new OnlineShopping.WebUser("Cesar", "password", UserState.NEW);
        OnlineShopping.Customer customer = new OnlineShopping.Customer("Rigoberto", "Fuengirola", "1234567890", "email@lalala.com");
        OnlineShopping.Account account = new OnlineShopping.Account("CuentaEjemplo", "Mijas", false, LocalDate.now(), null);

        assertNotNull(user);
        assertNotNull(customer);
        assertNotNull(account);
    }

    @Test
    public void testCreateProduct() {
        OnlineShopping.Product product = new OnlineShopping.Product("prod1", "Producto 1", "Supplier 1", new BigDecimal("10.68"));

        assertNotNull(product);
        assertEquals("Producto 1", product.getName());
    }

    @Test
    public void testAddProductToShoppingCart() {
        OnlineShopping.ShoppingCart cart = new OnlineShopping.ShoppingCart();
        OnlineShopping.Product product = new OnlineShopping.Product("prod1", "Producto 1", "Supplier 1", new BigDecimal("40.38"));
        cart.addProduct(product);

        assertEquals(1, cart.getProducts().size());
        assertEquals(new BigDecimal("40.38").setScale(2, RoundingMode.HALF_UP), cart.getTotal());
    }

    @Test
    public void testCreateOrderAndPayment() {
        OnlineShopping.ShoppingCart cart = new OnlineShopping.ShoppingCart();
        OnlineShopping.Product product = new OnlineShopping.Product("prod1", "Producto 1", "Supplier 1", new BigDecimal("19.99"));
        cart.addProduct(product);

        OnlineShopping.Order order = new OnlineShopping.Order("order1", LocalDate.now(), null, "Marbella", OrderStatus.NEW, cart.getTotal());
        OnlineShopping.Payment payment = new OnlineShopping.Payment("pay1", LocalDate.now(), cart.getTotal(), "Pagado con tarjeta de credito");

        assertNotNull(order);
        assertNotNull(payment);
        assertEquals(cart.getTotal(), order.getTotal());
        assertEquals(cart.getTotal(), payment.getTotal());
    }
}
