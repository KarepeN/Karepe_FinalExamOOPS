/**
 * 
 */
package ques10;
import java.util.Scanner;
/**
 * @author Nithya Karepe
 *
 */
public class InfiniteFactorialRecursion {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long factorial = infiniteRecursionFactorial(num);
		System.out.println(num + "! = " + factorial);
		sc.close();
	}
	// example for infinite recursion

    /**
     *
     * @param num
     * @return
     */
	public static long infiniteRecursionFactorial(int num) {
		return num * infiniteRecursionFactorial(num - 1);
	}
}
