package exempli.gratia.veterinary_management_app_system.v1.dto.response.animal;


import exempli.gratia.veterinary_management_app_system.v1.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalGetAllResponse {
    private String name; // Name of the animal

    private String species; // Species of the animal

    private String breed; // Breed of the animal

    private String gender; // Gender of the animal

    private String colour; // Colour of the animal

    private LocalDate dateOfBirth; // Date of birth of the animal

    private Customer customer; // Customer who owns the animal
}
