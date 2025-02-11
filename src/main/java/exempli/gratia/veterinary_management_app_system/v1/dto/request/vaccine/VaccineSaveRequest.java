package exempli.gratia.veterinary_management_app_system.v1.dto.request.vaccine;


import exempli.gratia.veterinary_management_app_system.v1.entities.Animal;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccineSaveRequest {
    @NotNull(message = "Vaccine name cannot be null.")
    private String name; // Name of the vaccine

    @NotNull(message = "Vaccine code cannot be null.")
    private String code; // Code of the vaccine

    @NotNull(message = "Vaccine start date cannot be null.")
    private LocalDate startDate; // Start date of the vaccine

    @NotNull(message = "Vaccine end date cannot be null.")
    private LocalDate endDate; // End date of the vaccine

    @NotNull(message = "Animal ID cannot be null.")
    private Animal animal; // ID of the animal associated with the vaccine
}
