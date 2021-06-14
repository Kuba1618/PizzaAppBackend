package projekt.psk.PizzaApp.orderModule.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.psk.PizzaApp.orderModule.models.Order;
import projekt.psk.PizzaApp.orderModule.repositories.OrderRepository;

import java.util.*;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;


    public String saveOrder(Order order){
       return this.orderRepository.save(order).getId();
    }
    public void deleteOrder(String id){
        this.orderRepository.deleteById(id);
    }

    public void updateOrder(Order newOrder, String id){
        Optional<Order> pizza = this.orderRepository.findById(id);
        pizza.ifPresent(piz -> {
            if(newOrder.getName() != null){
                piz.setName(newOrder.getName());
            }
            if(newOrder.getContent() != null){
                piz.setContent(newOrder.getContent());
            }
            if(newOrder.getPrice() != null){
                piz.setPrice(newOrder.getPrice());
            }
            this.orderRepository.save(piz);
        });
    }

    public List<Order> getAllPizzas(){
        return this.orderRepository.findAll();
    }
    public List<Order> getAllOwnedOrders(String id){
        return this.orderRepository.findByOwnerId(id);
    }
    public Optional<Order> getPizza(String id){
        return this.orderRepository.findById(id);
    }
    }


