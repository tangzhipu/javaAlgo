package ouc.jeep.abstractFactory;
/**
 *
 * Date-2014年12月18日
 */
public class ConcreteCreator1 implements Creator{

	@Override
	public ProductA factoryA() {
		return new ProductA1();
	}

	@Override
	public ProductB factoryB() {
		return new ProductB1();
	}

}
