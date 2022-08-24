import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deque<Person> clients = new ArrayDeque<>(generateClients());
        System.out.println("***** СПИСОК *****");
        for (Person s : clients) {
            System.out.println(s);
        }
        System.out.println("********************");
        while (!clients.isEmpty()) {
            Person s = clients.poll();
            System.out.println("Прокатилась  " + s);
            if (s.remainingTickets() > 0) {
                clients.offerLast(s);
            }
        }
    }

    static ArrayList<Person> generateClients() {
        ArrayList<Person> clients = new ArrayList<>();
        clients.add(new Person("Надежда", "Олейникова", 5));
        clients.add(new Person("Юлия", "Маклакова", 15));
        clients.add(new Person("Анютка", "Вольф", 5));
        clients.add(new Person("Алиса", "Маклакова", 20));
        clients.add(new Person("Полина", "Маклакова", 8));
        return clients;
    }


}
