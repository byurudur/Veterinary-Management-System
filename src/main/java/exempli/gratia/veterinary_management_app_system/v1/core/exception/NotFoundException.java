package exempli.gratia.veterinary_management_app_system.v1.core.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
