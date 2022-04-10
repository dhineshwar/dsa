package dsa_assignments;

public class TwoSumOfArray {
	static int[] targetSum(int []a , int target)
    {
        for(int i = 0 ; i < a.length - 1 ; i++)
            for(int j = i + 1 ; j < a.length ; j++)
            {
                if(a[i] + a[j] == target)
                    return new int[]{i + 1 , j + 1};
            }
        return new int[]{-1 , -1};
    }
    public static void main(String args[])
    {
        int [] a = {1 , 2 , 3 , 4 , 5};
        int target = 5;
        for(int x : targetSum(a , target))
            System.out.print(x + " ");
    }
}
