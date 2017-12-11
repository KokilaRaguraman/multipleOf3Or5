package multipleOf3Or5;

import java.util.Scanner;

/*Kokila
 * 19-10-2017
 * MultipleOf3Or5Only
 */
public class MultipleOf3Or5 {

	// expected outputs
	static boolean expected1 = true;
	static boolean expected2 = false;
	static boolean expected3 = false;
	static boolean expected4 = true;
	static boolean expected5 = false;
	static boolean expected6 = true;
	static boolean expected7 = true;
	static boolean expected8 = false;
	static boolean expected9 = true;
	// actual outputs
	static boolean actual1 = productionCode(25);
	static boolean actual2 = productionCode(26);
	static boolean actual3 = productionCode(15);
	static boolean actual4 = productionCode(6);
	static boolean actual5 = productionCode(45);
	static boolean actual6 = productionCode(12);
	static boolean actual7 = productionCode(50);
	static boolean actual8 = productionCode(98);
	static boolean actual9 = productionCode(100);

	// production code
	public static boolean productionCode(int input) {
		return ((input % 5 == 0) != (input % 3 == 0)) ? true : false;
	}

	public static void main(String[] args) {
		// test results
		if (actual1 == expected1)
			System.out.println("Case 1. Passed for the input 25 result is " + actual1);
		else
			System.out.println("Case 1. FAILED!!!! for the input 25 result is " + actual1);
		if (actual2 == expected2)
			System.out.println("Case 2. Passed for the input 26 result is " + actual2);
		else
			System.out.println("Case 2. FAILED!!!! for the input 26 result is " + actual2);
		if (actual3 == expected3)
			System.out.println("Case 3. Passed for the input 15 result is " + actual3);
		else
			System.out.println("Case 3. FAILED!!!! for the input 15 result is " + actual3);
		if (actual4 == expected4)
			System.out.println("Case 4. Passed for the input 6 result is " + actual4);
		else
			System.out.println("Case 4. FAILED!!!! for the input 6 result is " + actual4);
		if (actual5 == expected5)
			System.out.println("Case 5. Passed for the input 45 result is " + actual5);
		else
			System.out.println("Case 5. FAILED!!!! for the input 45 result is " + actual5);
		if (actual6 == expected6)
			System.out.println("Case 6. Passed for the input 12 result is " + actual6);
		else
			System.out.println("Case 6. FAILED!!!! for the input 12 result is " + actual6);
		if (actual7 == expected7)
			System.out.println("Case 7. Passed for the input 50 result is " + actual7);
		else
			System.out.println("Case 7. FAILED!!!! for the input 50 result is " + actual7);
		if (actual8 == expected8)
			System.out.println("Case 8. Passed for the input 98 result is " + actual8);
		else
			System.out.println("Case 8. FAILED!!!! for the input 98 result is " + actual8);
		if (actual9 == expected9)
			System.out.println("Case 9. Passed for the input 100 result is " + actual9);
		else
			System.out.println("Case 9. FAILED!!!! for the input 100 result is " + actual9);
		Scanner scan = new Scanner(System.in);
		int recheck;
		do {
			System.out.println("Enter an input to check the code");
			int input = scan.nextInt();
			boolean output = productionCode(input);
			System.out.println(output);
			System.out.println("If you need to check once again press 1 else 0");
			recheck = scan.nextInt();
		} while (recheck == 1);
		scan.close();
	}

}
