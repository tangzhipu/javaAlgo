package ouc.jeep.abstractFactory;
/**
 *
 * Date-2014年12月18日
 */
public class ConcreteCreator2 implements Creator{

	@Override
	public ProductA factoryA() {
		return new ProductA2();
	}

	@Override
	public ProductB factoryB() {
		return new ProductB2();
	}

}
