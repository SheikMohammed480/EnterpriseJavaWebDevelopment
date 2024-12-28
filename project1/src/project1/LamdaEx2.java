package project1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class LamdaEx2 {
    public static void main(String[] args) {
//        List<Person> people = Arrays.asList(
//            new Person("Alice", 23),
//            new Person("Bob", 30),
//            new Person("Charlie", 28),
//            new Person("David", 22)
//        );
//
//        // Ascending order by age
//        List<Person> ascendingOrder = people.stream()
//            .sorted((p1, p2) -> Integer.compare(p1.age, p2.age)) // Compare ages in natural order
//            .collect(Collectors.toList());
//
//        System.out.println("Ascending: " + ascendingOrder); // Output: [David (22), Alice (23), Charlie (28), Bob (30)]
//
//        // Descending order by age
//        List<Person> descendingOrder = people.stream()
//            .sorted((p1, p2) -> Integer.compare(p2.age, p1.age)) // Compare ages in reverse order
//            .collect(Collectors.toList());
//
//        System.out.println("Descending: " + descendingOrder); // Output: [Bob (30), Charlie (28), Alice (23), David (22)]
    	List<Person> people=Arrays.asList(
    						new Person("sheik",21),
    						new Person("sharmi",24)
    						);
    	List<Person> ascending=people.stream()
    						.sorted((a,b)->Integer.compare(a.age,b.age))
    						.collect(Collectors.toList());
    	System.out.println("ascend:"+ascending);
    	List<Person> descending=people.stream()
    							.sorted((a,b)-> Integer.compare(b.age,a.age))
    							.collect(Collectors.toList());
    	System.out.println("desc:"+descending);
    
    
    }
}

