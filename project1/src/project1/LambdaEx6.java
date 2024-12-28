package project1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class LambdaEx6 {
    public static void main(String[] args) {
        List<Person1> people = Arrays.asList(
            new Person1("Alice", 23),
            new Person1("Bob", 30),
            new Person1("Charlie", 28),
            new Person1("David", 22)
        );

        // Sort people by age in ascending order
        List<Person1> sortedByAge = people.stream()
            .sorted((p1, p2) -> Integer.compare(p1.age, p2.age)) // Lambda expression
            .collect(Collectors.toList());

        System.out.println("Sorted by age (ascending): " + sortedByAge);

        // Sort people by age in descending order
        List<Person1> sortedByAgeDesc = people.stream()
            .sorted((p1, p2) -> Integer.compare(p2.age, p1.age)) // Lambda expression
            .collect(Collectors.toList());

        System.out.println("Sorted by age (descending): " + sortedByAgeDesc);
    }
}
