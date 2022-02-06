

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueValuesFromArrayList {

	public static void main(String[] args) {
		System.out.println("Method 1(Using Stream API’s distinct() Method):");
		// Create ArrayList of Integers
		List<Integer> Numbers = Arrays.asList(1, 2, 1, 4, 2);
		Numbers.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("");
		System.out.println("Method 2(Using HashSet)");
		/*
		 * Converting List to HashSet using constructor.
		 */// Set set = new HashSet(list);
		HashSet<Integer> hashSetNumbers = new HashSet<Integer>(Numbers);
		// System.out.println(hashSetNumbers);
		// iterate through HashSet
		for (Integer strNumber : hashSetNumbers) {
			System.out.println(strNumber);
		}
		System.out.println("");
		// Converting List to LinkedHashSet using constructor.
        LinkedHashSet<Integer> UniqueList1
        = new LinkedHashSet<Integer>(Numbers);
        for (Integer Number : UniqueList1) {
			System.out.println(Number);
		}
        System.out.println("");
		System.out.println("LinkedHashSet - Maintaining order with no duplicate element’s insertion in the ArrayList.");
		
		 // Using LinkedHashSet we can prevent
        // insertion of duplicate elements
        // as it implements the Set interface
        LinkedHashSet<Integer> UniqueList
            = new LinkedHashSet<Integer>();
  
        // Adding elements to LinkedHashSet
        UniqueList.add(1);
        UniqueList.add(2);
        UniqueList.add(3);
        UniqueList.add(3); // duplicate 3 wont be inserted
        UniqueList.add(2); // duplicate 2 wont be inserted
  
        // Converting LinkedHashSet to List
        List<Integer> ls
            = new ArrayList<Integer>(UniqueList);
  
        // Printing list
        System.out.println(ls);
        
       
    }
	}

