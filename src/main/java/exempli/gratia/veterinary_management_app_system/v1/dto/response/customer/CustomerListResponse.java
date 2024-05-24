package exempli.gratia.veterinary_management_app_system.v1.dto.response.customer;


import exempli.gratia.veterinary_management_app_system.v1.entities.Animal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerListResponse {
    List<Animal> animalList; // List of animals associated with the customer
}
