package sorting;

import java.util.Arrays;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 4, 2);

        System.out.println("Original: " + numbers);

        BubbleSort.sort(numbers);
        System.out.println("Bubble Sorted: " + numbers);

        List<Integer> numbers2 = Arrays.asList(5, 3, 8, 4, 2);
        MergeSort.sort(numbers2);
        System.out.println("Merge Sorted: " + numbers2);
    }
}
