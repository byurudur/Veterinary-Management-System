package exempli.gratia.veterinary_management_app_system.v1.core.exception;

public class NotFoundDoctorException extends RuntimeException{
    public NotFoundDoctorException(String message) {
        super(message);
    }
}
