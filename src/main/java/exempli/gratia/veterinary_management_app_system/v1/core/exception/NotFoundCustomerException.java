package exempli.gratia.veterinary_management_app_system.v1.core.exception;

public class NotFoundCustomerException extends RuntimeException{
    public NotFoundCustomerException(String message) {
        super(message);
    }
}
