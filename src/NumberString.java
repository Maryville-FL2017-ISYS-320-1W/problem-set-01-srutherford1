/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: 11/26/2017
*/

/* 6.
 * Create a for loop that will
 *
 * 	have an int i = 1 which loop another loop 3 times
 *
 * 	in the nested loop an int j = 1 which will loop 10 times.
 *
 * 		in the loop you will print j 10 times.
 *
 * 		You will do this line three times.
 *
 * 	You will print these on separate lines using println.


*/

public class NumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<4; i++) {
			for (int j=1; j<10; j++) {

				System.out.print(j);
				System.out.print(j);
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
