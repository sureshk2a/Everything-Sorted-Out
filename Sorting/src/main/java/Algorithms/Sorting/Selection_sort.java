package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Collections;

/*Selection Sort
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and 
putting it at the beginning. The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to 
the sorted subarray.*/

import java.util.List;
import java.util.Scanner;

/*
 *  Algorithm = Selection Sort
 *  
 */
public class Selection_sort {

	public static List<Integer> ar = new ArrayList<Integer>();
	public int tot;

	public static void sort(List<Integer> lst) {

		
		int tot = lst.size();
				
		ArrayList<Integer> finlst = new ArrayList<Integer>();
		
		System.out.println(lst);
	
			for (int i = 0; i < tot; i++) {

				int minlst = Collections.min(lst);
				
				finlst.add(minlst);
				
				lst.remove(lst.indexOf(minlst));

		}

		System.out.println(finlst);

	}

	public static void main(String[] args) {

		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the total number of integers to sort");
		 
		 int tot = scan.nextInt();
		 
		 for(int i = 0;i<tot;i++) { tot = scan.nextInt(); ar.add(tot); }
		 
		System.out.println("Nothing");
		/*ar.add(3);
		ar.add(1);
		ar.add(78);
		ar.add(3);   			//To Test
		ar.add(9);
		ar.add(0);*/  

		sort(ar);

	}

}
