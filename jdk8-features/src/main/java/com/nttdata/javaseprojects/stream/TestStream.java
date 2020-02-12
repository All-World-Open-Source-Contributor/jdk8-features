package com.nttdata.javaseprojects.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {

	public void useStream() {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		Stream<Integer> stream2 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream2.forEach(p -> System.out.println(p));

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream3 = list.stream();
		stream3.forEach(p -> System.out.println(p));

		Stream<Date> stream4 = Stream.generate(() -> {
			return new Date();
		});
		stream4.forEach(p -> System.out.println(p));

		IntStream stream5 = "12345_abcdefg".chars();
		stream5.forEach(p -> System.out.println(p));

		// OR

		Stream<String> stream6 = Stream.of("A$B$C".split("\\$"));
		stream6.forEach(p -> System.out.println(p));

		// Convert Stream to List – Stream.collect( Collectors.toList() )

		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			intList.add(i);
		}
		Stream<Integer> stream7 = list.stream();
		List<Integer> evenNumbersList = stream7.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);

		// Convert Stream to array – Stream.toArray( EntryType[]::new )

		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list2.add(i);
		}
		Stream<Integer> stream8 = list.stream();
		Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);

		// Filter

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

		// sort

		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		// count

		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();

	}
}
