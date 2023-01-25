
import java.io.*;
class threeway {

	public static void
	threeWayPartition(int[] arr, int lowVal, int highVal)	{

		int n = arr.length;

		int start = 0, end = n - 1;

		for (int i = 0; i <= end;) {


			if (arr[i] < lowVal) {

				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				start++;
				i++;
			}

			else if (arr[i] > highVal) {

				int temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
				end--;
			}

			else
				i++;
		}
	}

	
}

