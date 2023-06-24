package exceptions;

public class OpenPageException extends AssertionError{
    public static final String IMPOSSIBLE_OPEN_PAGE  = "Impossible open page. Check please!";
    public OpenPageException(String message, Throwable cause) {
        super(message, cause);
    }
}
