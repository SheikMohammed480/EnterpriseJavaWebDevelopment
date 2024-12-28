package project1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//mapping a list
public class LamdaEx4 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");

//         Convert all names to uppercase
        List<String> upperCaseNames = names.stream()
            .map(name -> name.toUpperCase()) // Lambda expression
            .collect(Collectors.toList());

        	List<String> LowerCaseNames=names.stream()
        								.map(name->name.toLowerCase())
        								.collect(Collectors.toList());
        System.out.println(LowerCaseNames);
        System.out.println(upperCaseNames);// Output: [ALICE, BOB, CHARLIE, DAVID, EDWARD]
    }
}

