package com.gittest.first;

public class Test {

	public static void main(String[] args) {
		System.out.println("Linearsearch algorithm");
		// Let's write some code.
		int arr[] = {2, 3, 4, 10, 18, 17, 40};
		int x = 19;
		Search search = new Search();
		int result = search.search(arr, x);
		if(result == -1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element is present at the index "+result);
	}

}
