package projekt.psk.PizzaApp.orderModule.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import projekt.psk.PizzaApp.deliveryModule.Delivery;
import projekt.psk.PizzaApp.orderModule.models.Order;
import projekt.psk.PizzaApp.orderModule.repositories.OrderRepository;
import projekt.psk.PizzaApp.orderModule.services.OrderService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class OrderControllerTest {

    @Autowired
    OrderService orderService;
    @Autowired
    OrderRepository orderRepository;

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
        String orderString = "{\n" +
                "    \"name\": \"Adam\",\n" +
                "    \"surname\": \"Krycha\",\n" +
                "    \"city\": \"Lublin\",\n" +
                "    \"post_code\": \"22-123\",\n" +
                "    \"street\": \"Matyldy\",\n" +
                "    \"price\": \"44\",\n" +
                "    \"payment\": \"payPal\",\n" +
                "    \"ownerId\": \"4\"\n" +
                "}";

        try{
            Order order = new ObjectMapper().readValue(orderString, Order.class);
            System.out.println(order);
            orderRepository.save(order);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    void updateOrder() {
        String orderID = "60c8b15b71a1eb0ec7e36f90";
        Optional<Order> order = this.orderRepository.findById(orderID);
        order.get().setName("Maciek");
        this.orderRepository.save(order.get());
        Assert.assertTrue(this.orderRepository.findById(orderID).get().getName().equals("Maciek"));
    }

    @Test
    void deleteOrder() {
        String orderID = "60c8b15b71a1eb0ec7e36f90";
        this.orderRepository.deleteById(orderID);
        System.out.println(this.orderRepository.findById(orderID));
        Assert.assertTrue(this.orderRepository.findById(orderID).isEmpty());
    }

    @Test
    void getOrder() {
        String orderID = "60c8b15b71a1eb0ec7e36f90";
        Optional<Order> order = orderService.getPizza(orderID);
        Assert.assertTrue("Lublin".equals(order.get().getCity()));
    }

    @Test
    void getAllOrders() {
        List<Order> orders = orderService.getAllPizzas();
        System.out.println(orders.get(0));
        Assert.assertTrue("Lublin".equals(orders.get(0).getCity()));
    }

    @Test
    void getAllOwnedOrders() {
    }
}