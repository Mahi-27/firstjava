package pakage1;

public class Forloop {

	public static void main(String[] args) {
		
		/*
		 *  we use for loop when the number of iteration is known
		 */
		
//		for (int i=0; i<=100;i+=10) {
//			System.out.println("The iteration:" + " "+ i) ;
//		}
		
		String family [] = {"Birhanu", "Mahlet","Nathan","Markan"};
		
		System.out.println(family[0]);
		System.out.println(family[1]);
		System.out.println(family[2]);
		System.out.println(family[3]);
		
		for (int i=0; i<family.length; i++) {
			System.out.println("My Family:" + family[i]);
		}
	}

}
