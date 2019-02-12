public class NameUndefinedException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Wprowadzono niepoprawnie imię lub nazwisko";
    }
}
