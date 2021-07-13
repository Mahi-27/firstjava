package pakage1;

import java.util.Arrays;
import java.util.Collections;

public class maxMin {

	
	public static void main(String[] args) {
		
		int array []= {34,676,6767,3435};
		int min = array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i]< min) {
				min = array[i];
			}
		}
		
		System.out.println(min);
		
		
		
//		int x =6;
//		int y=8;
		System.out.println(Math.max(78,89));
		System.out.println(Math.min(78, 10));
		
		
	}



}




