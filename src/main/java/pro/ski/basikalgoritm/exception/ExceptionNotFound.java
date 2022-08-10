package pro.ski.basikalgoritm.exception;

public class ExceptionNotFound extends RuntimeException{
    public ExceptionNotFound() {
    }

    public ExceptionNotFound(String message) {
        super(message);
    }

    public ExceptionNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionNotFound(Throwable cause) {
        super(cause);
    }

    public ExceptionNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
