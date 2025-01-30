public class InvalidDimensionException extends Exception {
    private final int exceptionValue;

    public InvalidDimensionException(String message, int exceptionValue) {
        super(message);
        this.exceptionValue = exceptionValue;
    }

    public int getExceptionValue() {
        return exceptionValue;
    }
}
