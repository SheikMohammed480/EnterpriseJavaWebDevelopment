package project1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//sorting a name list in asc & desc
public class LamdaEx5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");

        // Sort names in ascending order
        List<String> ascendingOrder = names.stream()
            .sorted((a, b) -> a.compareTo(b)) // Lambda expression
            .collect(Collectors.toList());

        System.out.println("Ascending: " + ascendingOrder); // Output: [Alice, Bob, Charlie, David, Edward]

        // Sort names in descending order
        List<String> descendingOrder = names.stream()
            .sorted((name1, name2) -> name2.compareTo(name1)) // Lambda expression
            .collect(Collectors.toList());

        System.out.println("Descending: " + descendingOrder); // Output: [Edward, David, Charlie, Bob, Alice]
    }
}
