package ouc.jeep.collection;

import java.util.Scanner;

/**
 * Date-2014年12月4日
 *
 */
public class Word {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.err.println("Before - " +str);
		str = str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase())  ; 
		System.err.println(str);
	} 
}
