package projekt.psk.PizzaApp.userModule.controllers;

import org.junit.jupiter.api.Test;
import projekt.psk.PizzaApp.userModule.models.User;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    @Test
    void userCheckAll() {
        User user = new User("adminek","adminek1@o2.pl","admin1");
        assertEquals("adminek",user.getUsername());
        assertEquals("adminek1@o2.pl",user.getEmail());
        assertEquals("admin1",user.getPassword());
    }

    @Test
    void getAllUsers() {
    }

    @Test
    void getAllUnactivatedUsers() {
    }

    @Test
    void getUser() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void activateUser() {
    }
}