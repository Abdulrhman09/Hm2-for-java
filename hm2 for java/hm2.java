package term2;
public class hm2 {
	public static void main(String[] args) {
			
		

		
		int ar [][] = { { 1, 3 , 2} , {200, 100} , {60 , 50 ,70} };
		
		for (int i = 0; i < ar.length; i++){
			
	            for (int j=0;j < ar[i].length; j++) {
	            	for (int x=0;x < ar[i].length -j -1; x++) {
	            		if (ar[i][x] > ar[i] [x +1] ) {
	            			int y = ar[i] [x];
	            			ar [i][x] =ar [i][x+1];
	            			ar [i][x+1] =y;
	            		}
	            	}
		}
				
}
		for (int i=0; i<ar.length; i++) {
            for (int j=0;j < ar[i].length; j++) 
			System.out.print(ar[i][j]+"\t");
			System.out.println();
		}
		System.out.println();
		System.out.println(ar[1][1]);

}
}
	