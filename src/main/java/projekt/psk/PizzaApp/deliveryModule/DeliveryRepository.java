package projekt.psk.PizzaApp.deliveryModule;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;
import projekt.psk.PizzaApp.deliveryModule.Delivery;

public interface DeliveryRepository extends MongoRepository<Delivery, String> {
}