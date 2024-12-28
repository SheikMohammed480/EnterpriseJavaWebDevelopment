package project1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaEx1 {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1, 7, 4, 6);
//
//        // Ascending order
//        List<Integer> ascendingOrder = numbers.stream()
//            .sorted() // Natural order, which is ascending for integers
//            .collect(Collectors.toList());
//
//        System.out.println("Ascending: " + ascendingOrder); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
//
//        // Descending order
//        List<Integer> descendingOrder = numbers.stream()
//            .sorted((a, b) -> b.compareTo(a)) // Reverse order
//            .collect(Collectors.toList());
//
//        System.out.println("Descending: " + descendingOrder); // Output: [8, 7, 6, 5, 4, 3, 2, 1]
    List<Integer> number=Arrays.asList(1,5,6,2,0);
    List<Integer> ascending=number.stream()
    						.sorted()
    						.collect(Collectors.toList());
    System.out.println("ascending:"+ascending);
    List<Integer> descending=number.stream()
    						.sorted((a,b)-> b.compareTo(a))
    						.collect(Collectors.toList());
    System.out.println("des:"+descending);
    
    
    
    
    }
}
