import java.util.Scanner;

public class PersonText {
    public static void main(String[] args) {

        System.out.println("Podaj dane");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String pesel = scan.nextLine();

        try {
            Person person = new Person(firstName, lastName, age, pesel);
            //person.setFirstName(null);
            //person.setLastName(null);
            person.setAge(-1);
            System.out.println(person.toString());
        } catch (NameUndefinedException | IncorrectAgeException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
