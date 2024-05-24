package exempli.gratia.veterinary_management_app_system.v1.dto.request.availableDate;


import exempli.gratia.veterinary_management_app_system.v1.entities.Doctor;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvailableDateSaveRequest {
    @NotNull(message = "Date cannot be null.")
    private LocalDate date; // Date for the available date

    @NotNull(message = "Doctor ID cannot be null.")
    private Doctor doctors; // ID of the doctor for the available date
}
