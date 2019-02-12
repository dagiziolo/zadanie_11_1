public class NameUndefinedException extends Exception {
    @Override
    public String getMessage() {
        return "Wprowadzono niepoprawnie imię lub nazwisko";
    }
}
