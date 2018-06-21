import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook;

    public Phonebook() {
        this.phonebook = new ArrayList<Person>();
    }

    public void add(String name, String number){
        Person person = new Person(name, number);
        this.phonebook.add(person);
    }

    public int size(){
        return this.phonebook.size();
    }

    public String searchNumber(String name){
        for (Person person : phonebook) {
            if (name.equals(person.getName())){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
