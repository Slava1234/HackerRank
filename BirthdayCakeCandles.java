import java.util.*;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
     	int[] ar = new int[]{82, 49, 82, 82, 41, 82, 15, 63, 38, 25};
     	
     	System.out.println(birthdayCakeCandles(ar));	 
    }
    
    public static int birthdayCakeCandles(int[] ar) {
    	List<Integer> res = new ArrayList<>();
    	
    	for(int i = 0; i < ar.length; i++) {
    		if(i+1 < ar.length) {
    			if(ar[i] >= ar[i+1])
    				res.add(ar[i]);
    		}else {
    			if(res.get(res.size()-1) <= ar[i]) 
    				res.add(ar[i]);
    		}	
    	}
    	
    	int maxVal = res.stream().mapToInt(v -> v).max().getAsInt();
    
    	List<Integer> valToBeRemoved = new ArrayList<>();
    	for(int i = 0; i < res.size(); i++) {
    		int a = res.get(i);
    		if(a != maxVal) {
    			valToBeRemoved.add(a);
    		}
    	}
    	
    	res.removeAll(valToBeRemoved);
    	return res.size();
    }
    
 
}