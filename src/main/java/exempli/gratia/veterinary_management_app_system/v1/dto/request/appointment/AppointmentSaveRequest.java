package exempli.gratia.veterinary_management_app_system.v1.dto.request.appointment;


import exempli.gratia.veterinary_management_app_system.v1.entities.Animal;
import exempli.gratia.veterinary_management_app_system.v1.entities.Doctor;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentSaveRequest {
    @NotNull(message = "Animal ID cannot be null.")
    private Animal animal; // ID of the animal for the appointment

    @NotNull(message = "Doctor ID cannot be null.")
    private Doctor doctor; // ID of the doctor for the appointment

    @NotNull(message = "Date Time cannot be null.")
    private LocalDateTime dateTime; // Date and time of the appointment
}
