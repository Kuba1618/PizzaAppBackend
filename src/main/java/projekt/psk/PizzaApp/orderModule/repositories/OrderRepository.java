package projekt.psk.PizzaApp.orderModule.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import projekt.psk.PizzaApp.orderModule.models.Order;

import java.util.List;
import java.util.Optional;


public interface OrderRepository extends MongoRepository<Order, String> {
        Optional<Order> findById(String id);
        List<Order> findByOwnerId(String id);
        }
