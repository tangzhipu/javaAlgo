package ouc.jeep.staticFactory;
/**
 *
 * Date-2014年12月17日
 */
public class Client {

	public static void main(String[] args) {
		Fruit fruit = null;
		
		try {
			fruit = FruitGardener.factory("apple");
			fruit.grow();
		} catch (BadFruitException e) {
			e.printStackTrace();
		}
	}
}
