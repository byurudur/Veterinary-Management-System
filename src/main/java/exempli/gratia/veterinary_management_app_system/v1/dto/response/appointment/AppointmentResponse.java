package exempli.gratia.veterinary_management_app_system.v1.dto.response.appointment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentResponse {
    private LocalDateTime dateTime; // Date and time of the appointment
}
