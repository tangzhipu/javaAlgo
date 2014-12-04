package ouc.jeep.collection;

import java.util.Scanner;
/**
 *  键盘输入 用户名 密码，三次判别 
 */
public class Register {

	private static Scanner scan = new Scanner(System.in);
	static String name = "admin";
	static String password = "admin";

	public static void main(String[] args) {
		System.out.println();
		System.out.println("****************************");
		System.out.println("* Please input your name:  *");
		System.out.println("****************************");
		if (scan.nextLine().trim().equals(name)) { 
			for (int j = 0; j < 3; j++) {
				System.out.println("Please input your password: ");
				if (scan.nextLine().trim().equals(password)) {
					System.out.println("Login success!");
					return;
				}
			}  
			System.out
					.println("You have typed wrong password 3 times, system will be shutdown in 3 seconds!");
			try {
				for (int j = 3; j > 0; j--) {
					System.out.println("Remaining seconds: " + j + ".");
					Thread.sleep(1000);
				}
				System.exit(0);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		} // end if
		
	}
	
}
