package dsa_assignments;

public class FindIndexToInsertValue {
	static int find_index(int[] arr, int n, int k)
	{
	     
	    // Traverse the array
	    for(int i = 0; i < n; i++)
	     
	        // If K is found
	        if (arr[i] == k)
	            return i;
	 
	        // If current array element
	        // exceeds K
	        else if (arr[i] > k)
	            return i;
	 
	    // If all elements are smaller
	    // than K
	    return n;
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    int[] arr = { 1,2, 3,5, 6 };
	    int n = arr.length;
	    int k = 7;
	     
	    System.out.println(find_index(arr, n, k));
	}
}
