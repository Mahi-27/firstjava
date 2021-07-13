package pakage1;

public class cal {
	
	int x;
	int y;
public int add(int x, int y) {
	int addResult = x + y;
	return addResult;
}
public int sub(int x, int y) {
		int subResult = x - y;
		return subResult;
}
public int multiplication(int x, int y) {
		int multiplicationResult = x * y;
		return multiplicationResult;
	
}
	public static void main(String[] args) {
		cal obj = new cal();
		int result = obj.add(5, 8);
		System.out.println(result);
		System.out.println(obj.multiplication(5, 20));
		System.out.println(obj.sub(20, 30));
		
		
		
		
		
	}
	
	
	
	
	
}

