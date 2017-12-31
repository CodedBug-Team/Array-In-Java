import java.util.Scanner;

public class ArrayExample1 {

	public static final void main(String args[]) {
		int num[][] = new int[4][5];
		int i,j;
		Scanner a = new Scanner (System.in);
		
		for(i = 0 ; i < num.length ; i++) {
		
			for (j = 0 ; j < num[i].length ; j++) {
 				System.out.println("enter the number of " +" ( " +i+ " , " +j  +" ) " );
				num [i] [j] = a.nextInt();	
			}
		}
		for ( i = 0 ; i < num.length ; i++ ) {
 			for( j = 0 ; j < num[1].length ; j++) {
				System.out.print( " "+num[i][j]+" ");
			}
		}
		
		for(i = 0 ; i < num.length ; i++) {
 				int sumr = 0;
			 for(j = 0 ; j < num[1].length;j++) {
				sumr += num[i][j];
			}
			System.out.println("sum of row"+i+" " + " is " + " : "+sumr);
			continue;
		}
		for(j = 0; j < num[1].length;j++) {
				int sumc = 0;
			for(i = 0 ; i < num.length ; i++) {
				sumc += num[i][j];
			}
			System.out.println("sum col "+j+" "+"is"+" :"+sumc);
			continue;
		}
	}
}
