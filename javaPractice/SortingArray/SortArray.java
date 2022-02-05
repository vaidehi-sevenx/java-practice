/*Sorting of an array using sort() method  */

package javaPractice;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args) {
		Integer [] array = {23,4,5,7,31,34,8,22};
		/* sorting in descending order*/
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Sorting will be: "+Arrays.toString(array));
		/* sorting in ascending order */
		Arrays.sort(array);
		System.out.println("Sorting will be: "+Arrays.toString(array));
	}

}
