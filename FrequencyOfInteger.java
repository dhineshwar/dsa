package dsa_assignments;

public class FrequencyOfInteger {

	public static void main(String[] args) {
	
		int[] a= {1,2,2,1,2,7,1,2,1,1,1,8};
		int count=0;
		int target=1;
		for(int x:a) {
			if(x==target)
				count++;
		}
		System.out.println(count);
		}

}
