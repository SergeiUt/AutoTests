package practice_9.exceptions;

public class ValidEmailException extends RuntimeException{
    public ValidEmailException(String message) {
        super(message);
    }
}
