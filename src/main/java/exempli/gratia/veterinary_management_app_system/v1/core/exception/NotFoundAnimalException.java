package exempli.gratia.veterinary_management_app_system.v1.core.exception;

public class NotFoundAnimalException extends RuntimeException{
    public NotFoundAnimalException(String message) {
        super(message);
    }
}
