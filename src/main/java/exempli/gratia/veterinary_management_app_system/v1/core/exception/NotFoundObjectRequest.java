package exempli.gratia.veterinary_management_app_system.v1.core.exception;

public class NotFoundObjectRequest extends RuntimeException{
    public NotFoundObjectRequest(String message) {
        super(message);
    }
}
