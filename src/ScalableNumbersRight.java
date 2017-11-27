/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: 11/26/2017
*/
import java.util.Scanner;
public class ScalableNumbersRight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose scale for the right number triangle thing: ");
		int num = scan.nextInt();
		for( int line = 1; line <= num; line++ ) {
			for( int spacesIndex = 1; spacesIndex <= num - line; spacesIndex++ ) {
				System.out.print(" ");
			}
			for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) {
				System.out.print( line );
			}
			System.out.println();
		}

	}

}
