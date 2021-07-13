package pakage1;

public class multiDem {

	public static void main(String[] args) {
		
		int [][] twoDimn = {{3,4,5},{6,7,8,9},{10, 19, 21}, {13, 14}};
		
		System.out.println(twoDimn[1][2]);
		
		for(int i=0; i<twoDimn.length; i++) {
			
			for(int j=0; j<twoDimn[i].length; j++) {
				System.out.println("[i] =" + i + "[j]=" + j +"..."+ twoDimn[i][j]);
			}
		}
		
		int j=0;
		while(j<10) {
			System.out.println("This is me");
			j++;
		}
		
		
		
		
	}

}
