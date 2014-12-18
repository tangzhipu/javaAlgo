package ouc.jeep.factoryMethod;
/**
 *
 * Date-2014年12月18日
 */
public class ConcreteCreator1 implements Creator{

	@Override
	public Product factory() {
		return new ConcreteProduct1();
	}

}
