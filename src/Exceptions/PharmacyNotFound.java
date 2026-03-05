package Exceptions;

public class PharmacyNotFound extends RuntimeException {
    public PharmacyNotFound(String message) {
        super(message);
    }
}
