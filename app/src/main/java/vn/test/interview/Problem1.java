package vn.test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem1 {

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> arr2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> result = composeSortedArray(arr1, arr2);

        System.out.println("Composed two sorted array: " + result);
    }

    public static List<Integer> composeSortedArray(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                result.add(arr1.get(i));
                i++;
            } else {
                result.add(arr2.get(j));
                j++;
            }
        }

        while (i < arr1.size()) {
            result.add(arr1.get(i));
            i++;
        }

        while (j < arr2.size()) {
            result.add(arr2.get(j));
            j++;
        }

        return result;
    }

}
