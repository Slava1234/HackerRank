import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 5, 7, 9 };

		miniMaxSum(arr);
	
	}
	
	
	
	public static void miniMaxSum(int[] arr) {
		List<Integer> minNumbersArr = new ArrayList<>();
		List<Integer> maxNumbersArr = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			minNumbersArr.add(arr[i]);
			maxNumbersArr.add(arr[i]);
		}
		
		long minRes = minNumbersArr.stream().mapToInt(v -> v).sum() - minNumbersArr.stream().mapToInt(v -> v).max().getAsInt();
		int maxRes = maxNumbersArr.stream().mapToInt(v -> v).sum() - maxNumbersArr.stream().mapToInt(v -> v).min().getAsInt();
		
		System.out.println(minRes + " " + maxRes);
	}
	
	
	
	

}
