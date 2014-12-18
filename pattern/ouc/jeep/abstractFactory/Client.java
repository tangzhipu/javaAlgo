package ouc.jeep.abstractFactory;
/**
 *
 * Date-2014年12月18日
 */
public class Client {

	public static Creator creator1,creator2;
	public static ProductA productA1,productA2;
	
	public static void main(String[] args) {
		creator1 = new ConcreteCreator1();
		productA1 = creator1.factoryA();
	}
}
