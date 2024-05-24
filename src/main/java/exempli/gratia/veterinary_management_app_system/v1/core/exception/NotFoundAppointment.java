package exempli.gratia.veterinary_management_app_system.v1.core.exception;

public class NotFoundAppointment extends RuntimeException{
    public NotFoundAppointment(String message) {
        super(message);
    }
}
