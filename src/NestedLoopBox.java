/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: 11/26/2017
*/

/* 4.
 * create a for loop
 *  that declares width as an integer to equal 0;
 *  width is to loop less than six times to repeat the next loop
 *  height is an integer that is equal to 0.
 *  height is to print out six asterisks six times making:
 *
 *     ******
 *     ******
 *     ******
 *     ******
 *     ******
 *     ******
 *
 * Program ends.


*/
public class NestedLoopBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for (int width = 0; width < 6; width++){
				for (int height = 0; height < 6; height++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
