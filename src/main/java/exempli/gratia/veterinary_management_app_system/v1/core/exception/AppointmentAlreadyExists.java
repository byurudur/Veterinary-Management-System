package exempli.gratia.veterinary_management_app_system.v1.core.exception;

public class AppointmentAlreadyExists extends RuntimeException{
    public AppointmentAlreadyExists(String message) {
        super(message);
    }
}
