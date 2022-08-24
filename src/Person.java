
public class Person {
    private String name;
    private final String surname;
    private int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public int remainingTickets() {
        if (tickets > 0) {
            tickets--;
        }
        return tickets;
    }

    public String toString() {
        return name + "  " + surname + " количество билетов " + tickets;
    }

}
