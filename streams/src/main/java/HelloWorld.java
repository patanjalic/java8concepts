import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println("hello world");
//		List<String> collected = Stream.of("a","b","c").collect(Collectors.toList());
//		long count = collected.stream().filter(str->{
//			System.out.println("str is "+str);
//			return str.equals("a");
//		}).count();
//		System.out.println("count is "+count);
//		List<String> myList =
//			    Arrays.asList("a1", "a2", "b1", "c2", "c1");
//
//			myList
//			    .stream()
//			    .map(String::toUpperCase)
//			    .sorted()
//			    .forEach(System.out::println);
//			
//			Stream.of("d2", "a2", "b1", "b3", "c")
//		    .filter(s -> {
//		        System.out.println("filter: " + s);
//		        return true;
//		    })
//		    .forEach(s -> System.out.println("forEach: " + s));
			
//			Stream.of("d2", "b2", "a1", "b3", "a")
//		    .map(s -> {
//		        System.out.println("map: " + s);
//		        return s.toUpperCase();
//		    })
//		    .anyMatch(s -> {
//		        System.out.println("anyMatch: " + s);
//		        return s.startsWith("A");
//		    });
		Arrays.asList("b","c3","r2","d2","a1","fu")
		.stream()
		.filter(s-> {
			System.out.println("filter "+s);
			return s.startsWith("a");
		})
		.map(s-> {
			System.out.println("map "+s);
			return s.toUpperCase();
		})
		.forEach(s->System.out.println("foreach "+s));
	}
	

}
