

public class Staircase {
	
	public static void main(String[] args) {
		buildStairs(6);
	}
	
	public static void buildStairs(int stairs) {
		String space = " ";
		String sign = "#";
		
		StringBuilder stair = new StringBuilder();
		
		int flag = stairs;
		
		for(int i = 1; i <= stairs; i++) {
			flag = stairs - i;
			
			while(flag != 0) {
				stair.append(space);
				flag--;
			}
			
			while(stair.length() != stairs) {
				stair.append(sign);
			}
		
			print(stair.toString());
			stair.setLength(0);
		}	
	}
	
	public static void print(String stair) {
		System.out.println(stair);
	}
	
	
}