package ouc.jeep.multition;
/**
 * Description:
 *
 * Date-2014年12月19日
 */
public class Client {

	private static Die die1,die2;
	
	public static void main(String[] args) {
		die1 = Die.getInstance(1);
		die2 = Die.getInstance(2);
		System.err.println(die1.dice());
		System.err.println(die2.dice());
	}
}
