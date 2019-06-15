package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Bubble Sort
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
 * 
 */
public class Bubble_sort {

	public static List<Integer> ar = new ArrayList<Integer>();
	
	public static void sort1(List<Integer> lst) {
		int tot  = lst.size();
		
		
		for (int i = 0; i < 3; i++) {		//Checks Three Time
						
			for(int j = 0;j<tot;j++)
			{
								
				if(lst.get(j)>lst.get(j+1))
				{
					lst.set(j, lst.get(j+1));
				}
								
			}
					
		}
		
		System.out.println(lst);
		
								
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total number of integers to sort");
		 
		 int tot = scan.nextInt();
		 
		 for(int i = 0;i<tot;i++) { tot = scan.nextInt(); ar.add(tot); }*/
		 
	
		ar.add(3);
		ar.add(1);
		ar.add(78);
		ar.add(3);   			//For Test
		ar.add(9);
		ar.add(0); 

		sort1(ar);
		
	}

}
