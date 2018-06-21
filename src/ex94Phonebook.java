public class ex94Phonebook {
    public static void main(String [] args) {
        Person paul = new Person("Paul Grech", "631-662-9798");
        System.out.println(paul);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");
        System.out.println("Size: " + phonebook.size());

        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println( number );

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println( number );

    }
}
