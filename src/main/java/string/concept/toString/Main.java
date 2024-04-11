package string.concept.toString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Tom", 12, "Student" );
        System.out.println(person);


        Date date = new Date();
        String str = date.toString();
        System.out.println(str);

        List<Person> people = new ArrayList<Person>();
        people.add(person);

    }
}
