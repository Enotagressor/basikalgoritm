package pro.ski.basikalgoritm.exception;

public class ExceptionNull extends RuntimeException{
    public ExceptionNull() {
    }

    public ExceptionNull(String message) {
        super(message);
    }

    public ExceptionNull(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionNull(Throwable cause) {
        super(cause);
    }

    public ExceptionNull(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
