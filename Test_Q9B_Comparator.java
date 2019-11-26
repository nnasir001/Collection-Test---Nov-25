package CollectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_Q9B_Comparator {

	
	public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Naushin Nasir", 35));
        persons.add(new Person("Sabah ", 20));
        persons.add(new Person("Summer Zaynab", 18));
        persons.add(new Person("Sher Tariq", 49));

        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person person, Person person1) {
                int name = person.getName().compareTo(person1.getName());
                if(name == 0){
                    return name;
                }
                return person.getAge() > person1.getAge() ? 1 : person.getAge() < person1.getAge() ? -1 : 0;
            }
        });


        for (Person person : persons) {
            System.out.println("Person is: " + person.getName());
        }
    }
}
