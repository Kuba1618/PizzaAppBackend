package projekt.psk.PizzaApp.deliveryModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @PostMapping("/add")
    public String saveDelivery(@RequestBody Delivery delivery) {
        return this.deliveryService.saveDelivery(delivery);
    }

    @GetMapping("/get/{id}")
    public Optional<Delivery> getDelivery(@PathVariable(value="id", required=true) String id){
        return this.deliveryService.getDelivery(id);
    }

    @GetMapping("/get")
    public List<Delivery> getAllDelivery() {
        return this.deliveryService.getAllDelivery();
    }

    /*@GetMapping("/get/check")
    public boolean checkIfItCanBeDelivered(@RequestBody Delivery delivery) {
        if()
    }*/
}
