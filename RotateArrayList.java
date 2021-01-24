/*A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given an integer d, , rotate the array that many steps left and return the result.
	Constraints

	Sample Input

	5 4
	1 2 3 4 5
	Sample Output

	5 1 2 3 4*/
  
package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sol {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(rotateLeft(2, al));
	}

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {

		int[] a = arr.stream().mapToInt(i -> i).toArray();
		int n = arr.size();
		int[] rotArray = new int[n];

		for (int oldIndex = 0; oldIndex < n; oldIndex++) {
			int newIndex = (oldIndex + n - d) % n;
			rotArray[newIndex] = a[oldIndex];
		}

		List<Integer> al = IntStream.of(rotArray).boxed().collect(Collectors.toList());

		return al;
	}

}
