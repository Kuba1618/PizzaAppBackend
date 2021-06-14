package projekt.psk.PizzaApp.orderModule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.psk.PizzaApp.orderModule.models.Order;
import projekt.psk.PizzaApp.orderModule.services.OrderService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/add")
    public String saveOrder(@RequestBody Order order) {
        return this.orderService.saveOrder(order);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateOrder(@PathVariable(value="id", required=true) String id, @RequestBody Order order){
        this.orderService.updateOrder(order, id);
        return ResponseEntity.ok("Zaktualizowano pomyślnie");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable(value="id", required=true) String id){
        this.orderService.deleteOrder(id);
        return ResponseEntity.ok("Zamówienie zostało usunięta");
    }

    @GetMapping("/get/{id}")
    public Optional<Order> getOrder(@PathVariable(value="id", required=true) String id){
        return this.orderService.getPizza(id);
    }

    @GetMapping("/get")
    public List<Order> getAllOrders() {
        return this.orderService.getAllPizzas();
    }

    @GetMapping("/get-owned/{id}")
    public List<Order> getAllOwnedOrders(@PathVariable(value="id", required=true) String id) {
        return this.orderService.getAllOwnedOrders(id);
    }


}
