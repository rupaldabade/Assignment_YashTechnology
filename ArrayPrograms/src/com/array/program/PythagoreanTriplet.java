package com.array.program;

/* An Array contain the n numbers you have to find out combination which satisfy Pythagoras 
Template. ( Pythagoras templates:- 3*3+4*4==5*5)
 */
public class PythagoreanTriplet {
	static boolean isTriplet(int ar[], int n)
	{
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					// Calculate square of array elements
					int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

					if (x == y + z || y == x + z || z == x + y)
						return true;
				}
			}
		}

		// If we reach here, no triplet found
		return false;
	}

	public static void main(String[] args)
	{
		int ar[] = { 3, 1, 4, 6, 5 };
		int ar_size = ar.length;
		if (isTriplet(ar, ar_size) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
