package pro.ski.basikalgoritm.exception;

public class ExceptionInvalidIndex extends RuntimeException{
    public ExceptionInvalidIndex() {
    }

    public ExceptionInvalidIndex(String message) {
        super(message);
    }

    public ExceptionInvalidIndex(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionInvalidIndex(Throwable cause) {
        super(cause);
    }

    public ExceptionInvalidIndex(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
