package projekt.psk.PizzaApp.deliveryModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;

    public String saveDelivery(Delivery delivery){
        return this.deliveryRepository.save(delivery).getId();
    }

    public List<Delivery> getAllDelivery(){
        return this.deliveryRepository.findAll();
    }

    public Optional<Delivery> getDelivery(String id){
        return this.deliveryRepository.findById(id);
    }

}
