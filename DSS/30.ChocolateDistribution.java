
import java.util.*;

class Chocolate{

	static int findMinDiff(int arr[], int n, int m)
	{
		if (m == 0 || n == 0)
			return 0;

		Arrays.sort(arr);

		if (n < m)
			return -1;

		int min_diff = Integer.MAX_VALUE;

		for (int i = 0; i + m - 1 < n; i++) {
			int diff = arr[i + m - 1] - arr[i];
			if (diff < min_diff)
				min_diff = diff;
		}
		return min_diff;
	}	
}

