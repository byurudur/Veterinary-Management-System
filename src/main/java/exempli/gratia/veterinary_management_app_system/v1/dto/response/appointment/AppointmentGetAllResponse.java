package exempli.gratia.veterinary_management_app_system.v1.dto.response.appointment;


import exempli.gratia.veterinary_management_app_system.v1.entities.Animal;
import exempli.gratia.veterinary_management_app_system.v1.entities.Doctor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentGetAllResponse {
    private LocalDateTime dateTime; // Date and time of the appointment

    private Doctor doctor; // Doctor associated with the appointment

    private Animal animal; // Animal associated with the appointment
}
