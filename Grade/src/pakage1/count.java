package pakage1;

public class count {

	public static void main(String[] args) {
	
		String myName = "mahlet";
		
//		System.out.println(myName.length());
		
		for(int i=myName.length()-1;i>=0; i--) {
		
//			System.out.print(myName.charAt(i));
		}
		
		// fibonacci 0112358
		
		int num1 = 0;
		int num2 =1;
		
		for (int i=0; i<10;i++) {
			System.out.println(num1);
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
			
		}
	
		
	}

}
