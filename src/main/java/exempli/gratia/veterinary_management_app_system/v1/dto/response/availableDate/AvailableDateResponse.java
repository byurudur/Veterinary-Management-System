package exempli.gratia.veterinary_management_app_system.v1.dto.response.availableDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvailableDateResponse {
    private LocalDate date; // Date of the available date
}
