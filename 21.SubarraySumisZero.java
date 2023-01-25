
// Sum of Subarrays add up to 0
import java.util.*;
class ZeroSumSubarray {

	static Boolean subArrayExists(int arr[])
	{		
		Set<Integer> hs = new HashSet<Integer>();		
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
		
			sum += arr[i];

			if (arr[i] == 0 || sum == 0 || hs.contains(sum))
				return true;

			hs.add(sum);
		}

		return false;
	}

}
