//Name: Likhitha Reddy Adulla
//Id: 700706878
//imporitng all the packages required
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class RandomNumbers {
	public static void main(String [] args)
	{
	Random rd = new Random();// Random class to generate random numbers
	Integer[] intArray = new Integer[100];// declaration of array to store 100 integers
	for (int i = 0; i < intArray.length; i++) {
		intArray[i] = rd.nextInt(30); // storing random integers from 1 to 30 in an array

	}
	System.out.println("Random integers before removing duplicates");
	System.out.println(Arrays.toString(intArray)); // print the integer arrays in string format with tostring 
	System.out.println("Random integers after remoing Duplicates in the ascending order");
	HashSet<Integer> se = new LinkedHashSet<Integer>(); // createing a hash set to hold the integers
	for(int i=0;i<intArray.length;i++)
	{
		se.add(intArray[i]);// adding the integers to set
	}
	
	ArrayList<Integer> al = new ArrayList<>(); // Creating an array list to use for sorting 
	al.addAll(se);// adding the set to list 
	Collections.sort(al);// sorting the list
	System.out.println(al);// printing in ascending order
    se.clear();// removing all the elements from th set
    Collections.reverse(al);// reversing the list to descending order
    System.out.println();
    System.out.println("Random integers in the descending order");
    for (int i : al) {
        System.out.print(" " + i); // printiong in descending order
    }

	
}
}