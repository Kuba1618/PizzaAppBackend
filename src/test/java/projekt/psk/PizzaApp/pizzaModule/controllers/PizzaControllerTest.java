package projekt.psk.PizzaApp.pizzaModule.controllers;

import org.junit.jupiter.api.Test;
import projekt.psk.PizzaApp.pizzaModule.models.Pizza;

import static org.junit.jupiter.api.Assertions.*;

class PizzaControllerTest {

    @Test
    void PizzaCheckName() {
        Pizza pizza = new Pizza();
        pizza.setName("PRL");
        assertEquals("PRL",pizza.getName());
    }

    @Test
    void PizzaCheckDescription() {
        Pizza pizza = new Pizza();
        pizza.setDescription("grzybki, kielbasa");
        assertEquals("grzybki, kielbasa",pizza.getDescription());
    }

    @Test
    void PizzaCheckPrice() {
        Pizza pizza = new Pizza();
        pizza.setPrice("32.99");
        assertEquals("32.99",pizza.getPrice());
    }

    @Test
    void PizzaCheckUrlAdress() {
        Pizza pizza = new Pizza();
        pizza.setUrlAdress("www.cos.pl/obrazek");
        assertEquals("www.cos.pl/obrazek",pizza.getUrlAdress());
    }

    @Test
    void PizzaCheckOwnerId() {
        Pizza pizza = new Pizza();
        pizza.setOwnerId("12");
        assertEquals("12",pizza.getOwnerId());
    }

    @Test
    void savePizza() {
    }

    @Test
    void updatePizza() {
    }

    @Test
    void deletePizza() {
    }

    @Test
    void getPizza() {
    }

    @Test
    void getAllPizzas() {
    }

    @Test
    void getAllOwnedPizzas() {
    }
}