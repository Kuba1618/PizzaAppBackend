package projekt.psk.PizzaApp.deliveryModule;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
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
          String deliverString = "{\n" +
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
        }
    }

    @Test
    void getDelivery() {
       String deliveryID = "60c899f27d13694c08c492a9";
        Optional<Delivery> delivery = deliveryService.getDelivery("60c899f27d13694c08c492a9");
        Assert.assertTrue("Krakow".equals(delivery.get().getCity()));
    }

    @Test
    void getAllDelivery() {
        List<Delivery> deliveryList = deliveryService.getAllDelivery();
        System.out.println(deliveryList.get(0));
        Assert.assertTrue("Kielce".equals(deliveryList.get(0).getCity()));
    }

    @Test
    void checkIfItCanBeDelivered() {
        List<Delivery> deliveryList = deliveryService.getAllDelivery();
        String wynik = "false";
        if(deliveryService.checkIfItCanBeDelivered(deliveryList.get(1)) == true)
            wynik = "true";
        Assert.assertTrue("true".equals(wynik));
    }
}