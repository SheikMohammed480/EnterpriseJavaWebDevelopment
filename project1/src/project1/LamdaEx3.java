package project1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//filtering a list
public class LamdaEx3 {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");
//
//        // Filter names that start with 'A'
//        List<String> filteredNames = names.stream()
//            .filter(name -> name.startsWith("A")) // Lambda expression
//            .collect(Collectors.toList());
//
//        System.out.println(filteredNames); // Output: [Alice]
    	 List<String> names=Arrays.asList("sheik","sharmi","fathima");
    	 List<String> filterName=names.stream()
    			 				.filter(name->name.startsWith("s"))
    			 				.collect(Collectors.toList());
    	 System.out.println("start with s:"+filterName);
    
    }
}
