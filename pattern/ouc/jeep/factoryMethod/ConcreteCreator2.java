package ouc.jeep.factoryMethod;
/**
 *
 * Date-2014年12月18日
 */
public class ConcreteCreator2 implements Creator{

	@Override
	public Product factory() {
		return new ConcreteProduct2();
	}

}
