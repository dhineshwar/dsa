package dsa_assignments;

public class Powerofnum {
	static long power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
  
    public static void main(String[] args)
    {
        int N = 4;
        int P = 65;
  
        System.out.println(power(N, P));
    }
}

