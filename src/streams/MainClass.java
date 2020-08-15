package streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {

		List<Person> person = getAllData();

		// filter
//		List<Person> collect = person.stream().filter(data -> data.getGender().equals(Gender.MALE))
//				.collect(Collectors.toList());

		// sorted
		List<Person> collect = person.stream()
				.sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		
		//boolean anyMatch = person.stream().noneMatch(data -> data.getAge() > 1);
		
//		person.stream().min(Comparator.comparing(Person::getAge)).ifPresent(p -> {
//			System.out.println(p);
		
//		});
		
		Map<Gender, List<Person>> collect2 = person.stream().collect(Collectors.groupingBy(Person::getGender));
		collect2.forEach((gender, per)-> {
			System.out.println(gender);
			per.forEach(System.out::println);
		});
	}

	public static List<Person> getAllData() {

		List<Person> asList = Arrays.asList(new Person("Shubham", 23, Gender.MALE),
				new Person("Daksh", 19, Gender.MALE), new Person("John", 40, Gender.MALE),
				new Person("Elly", 26, Gender.FEMALE));
		return asList;

	}
}
