public class IncorrectAgeException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Wprowadzono liczę lat <1";
    }
}
