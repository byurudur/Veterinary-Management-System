package exempli.gratia.veterinary_management_app_system.v1.dto.request.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerSaveRequest {
    @NotNull(message = "Customer name cannot be null.")
    private String name; // Name of the customer

    @NotNull(message = "Customer phone cannot be null.")
    private String phone; // Phone number of the customer

    @NotNull(message = "Customer mail cannot be null.")
    @Email(message = "Email format is wrong. Format : mail@mail.com")
    private String mail; // Email address of the customer

    @NotNull(message = "Customer address cannot be null.")
    private String address; // Address of the customer

    @NotNull(message = "Customer city cannot be null.")
    private String city; // City of the customer
}
