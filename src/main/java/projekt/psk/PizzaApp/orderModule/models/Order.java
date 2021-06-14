package projekt.psk.PizzaApp.orderModule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String id;

    @NotBlank
    @Size(max = 20)
    private String name;

    @NotBlank
    @Size(max = 30)
    private String surname;

    @NotBlank
    @Size(max = 30)
    private String city;

    @NotBlank
    @Size(max = 7)
    private String post_code;

    @NotBlank
    @Size(max = 30)
    private String street;

    @NotBlank
    @Size(max = 6)
    private String houseNumber;

    @NotBlank
    @Size(max = 10)
    private String price;

    @NotBlank
    @Size(max = 10)
    private String payment;

    @NotBlank
    @Size(max = 120)
    private String[] content;

    private String ownerId;
}
