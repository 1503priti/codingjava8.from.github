

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfRandomNumber {

	public static void main(String[] args) {
		// Display 10 Random numbers using forEach()
		Random r = new Random();
		System.out.println("Que 1. Display 10 Random numbers using forEach()");
		r.ints().limit(10).forEach(System.out::println);
		System.out.println();
		System.out.println(
				"Que 2. new Random.ints(streamSize, randomNumberOrigin, randomNumberBound).forEach(System.out::println)? ");
		new Random().ints(10, 10, 20).forEach(System.out::println);
		System.out.println();
		System.out
				.println("Que 3. generates 10 random numbers between 1 to 50 and every time generating a new number ");
		for (int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * (50 + 1));
			System.out.println(random);
		}
		System.out.println();
		System.out.println("Que 4. Five random doubles between 0 (inclusive) and 0.5 (exclusive)");
		r.doubles(5, 0, 0.5).sorted().forEach(System.out::println);

		System.out.println();
		System.out.println("Que 5. Boxing long to Long so they can be collected\r\n" + " ");
		List<Long> longs = r.longs(5).boxed().collect(Collectors.toList());
		System.out.println(longs);
		System.out.println();
		System.out.println("Que 6. display unique squares of numbers using the method map()?");
		Stream.of(1, 2, 3, 2, 1).map(s -> s * s).distinct().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("Que 7. to display 10 random numbers in ascending order?");
		r.ints().limit(10).sorted().forEach(System.out::println);
		System.out.println();
		r.ints(10, 10, 20).sorted().forEach(System.out::println);
	}

}
