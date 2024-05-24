package exempli.gratia.veterinary_management_app_system.v1.core.exception;

public class AppointmentConflictException extends RuntimeException{
    public AppointmentConflictException(String message) {
        super(message);
    }
}
