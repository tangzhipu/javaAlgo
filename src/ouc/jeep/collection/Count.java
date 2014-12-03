package ouc.jeep.collection;

import java.util.Scanner;

/**
 * 给定一个字符串统计,统计大写字母,小写字母,数字出现的个数.
 * 
 */

public class Count {

	public static void main(String[] args) {
		int cntUpper = 0;
		int cntLower = 0; 
		int cntNumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.err.println("Input a string : "); 
		String str = scanner.nextLine();
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch>='a'&&ch<='z'){
				cntLower ++;
			}else if(ch>='A'&&ch<='Z'){
				cntUpper ++;
			}else{
				cntNumber ++;
			}
			
		}
		
		System.err.println(str); 
		System.err.println("cntLower :"+cntLower+" cntUpper :" +cntUpper
					+" cntNumber : "+ cntNumber);
		
	}
}
