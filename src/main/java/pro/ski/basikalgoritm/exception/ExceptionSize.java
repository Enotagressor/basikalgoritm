package pro.ski.basikalgoritm.exception;

public class ExceptionSize extends RuntimeException{
    public ExceptionSize() {
    }

    public ExceptionSize(String message) {
        super(message);
    }

    public ExceptionSize(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionSize(Throwable cause) {
        super(cause);
    }

    public ExceptionSize(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
