import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

	public static void main(String[] args) {
		int[] arr = new int[] {256741038, 623958417, 467905213, 714532089, 938071625};
		miniMaxSum(arr);
	}

	public static void miniMaxSum(int[] arr) {
		List<Long> minNumbersArr = new ArrayList<>();
		List<Long> maxNumbersArr = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			minNumbersArr.add((long)arr[i]);
			maxNumbersArr.add((long)arr[i]);
		}
		
		System.out.println(maxNumbersArr.stream().mapToLong(v -> v).sum());
		System.out.println(maxNumbersArr.stream().mapToLong(v -> v).min().getAsLong());
	

		long minRes = minNumbersArr.stream().mapToLong(v -> v).sum() - minNumbersArr.stream().mapToLong(v -> v).max().getAsLong();
		long maxRes = maxNumbersArr.stream().mapToLong(v -> v).sum() - maxNumbersArr.stream().mapToLong(v -> v).min().getAsLong();

		System.out.println(minRes + " " + maxRes);
	}

}
