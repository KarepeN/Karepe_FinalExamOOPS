/**
 * 
 */
package ques10;
import java.util.Scanner;
/**
 * @author Nithya Karepe
 *
 */
public class FactorialRecursion {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long factorial = calcFactorial(num);
		System.out.println(num + "! = " + factorial);
		sc.close();
	}

    /**
     *
     * @param num
     * @return
     */
    public static long calcFactorial(int num) {
		if (num >= 1)
			return num * calcFactorial(num - 1);
		else
			return 1;
	}
}
