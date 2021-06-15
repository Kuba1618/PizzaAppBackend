package projekt.psk.PizzaApp.deliveryModule;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryControllerTest {

    @Autowired
    DeliveryService deliveryService;
    @Autowired
    DeliveryRepository deliveryRepository;

    @Test
    void DeliveryCheckCity() {

        Delivery delivery = new Delivery();
        delivery.setCity("Krakow");
        assertEquals("Krakow",delivery.getCity());

      /*  String deliverString = "{\n" +
                "    \"city\": \"Krakow\",\n" +
                "    \"street\": \"Krakowska\",\n" +
                "    \"houseNumber\": \"07\"\n" +
                "}";

        try{
            Delivery delivery1 = new ObjectMapper().readValue(deliverString, Delivery.class);
            System.out.println(delivery1);
            deliveryRepository.save(delivery1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }*/

    }

    @Test
    void DeliveryCheckStreet() {
        Delivery delivery = new Delivery();
        delivery.setStreet("Krakowska");
        assertEquals("Krakowska",delivery.getStreet());
    }

    @Test
    void DeliveryCheckHouseNumber() {
        Delivery delivery = new Delivery();
        delivery.setHouseNumber("1/17");
        assertEquals("1/17",delivery.getHouseNumber());
    }


    @Test
    void saveDelivery() {

    }

    @Test
    void getDelivery() {

    }

    @Test
    void getAllDelivery() {

    }

    @Test
    void checkIfItCanBeDelivered() {

    }
}