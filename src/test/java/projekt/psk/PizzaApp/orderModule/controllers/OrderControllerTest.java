package projekt.psk.PizzaApp.orderModule.controllers;

import org.junit.jupiter.api.Test;
import projekt.psk.PizzaApp.orderModule.models.Order;

import static org.junit.jupiter.api.Assertions.*;

class OrderControllerTest {

    @Test
    void OrderCheckName() {
        Order order = new Order();
        order.setName("Na Wynos");
        assertEquals("Na Wynos",order.getName());
    }

    @Test
    void OrderCheckSurname() {
        Order order = new Order();
        order.setSurname("Montana");
        assertEquals("Montana",order.getSurname());
    }

    @Test
    void OrderCheckCity() {
        Order order = new Order();
        order.setCity("Kielce");
        assertEquals("Kielce",order.getCity());
    }

    @Test
    void OrderCheckPost_code() {
        Order order = new Order();
        order.setPost_code("22-112");
        assertEquals("22-112",order.getPost_code());
    }

    @Test
    void OrderCheckStreet() {
        Order order = new Order();
        order.setStreet("Magistralna");
        assertEquals("Magistralna",order.getStreet());
    }

    @Test
    void OrderCheckHouseNumber() {
        Order order = new Order();
        order.setHouseNumber("7");
        assertEquals("7",order.getHouseNumber());
    }

    @Test
    void OrderCheckPrice() {
        Order order = new Order();
        order.setPrice("33");
        assertEquals("33",order.getPrice());
    }

    @Test
    void OrderCheckPayment() {
        Order order = new Order();
        order.setPayment("payPal");
        assertEquals("payPal",order.getPayment());
    }

    @Test
    void OrderCheckOwnerId() {
        Order order = new Order();
        order.setOwnerId("123");
        assertEquals("123",order.getOwnerId());
    }

    @Test
    void saveOrder() {
    }

    @Test
    void updateOrder() {
    }

    @Test
    void deleteOrder() {
    }

    @Test
    void getOrder() {
    }

    @Test
    void getAllOrders() {
    }

    @Test
    void getAllOwnedOrders() {
    }
}