public class IncorrectAgeException extends Exception {
    @Override
    public String getMessage() {
        return "Wprowadzono liczę lat <1";
    }
}
