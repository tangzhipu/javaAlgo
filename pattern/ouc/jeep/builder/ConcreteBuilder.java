package ouc.jeep.builder;
/**
 * Description: 具体建造工具
 * Author-jeep
 * Date-2014年12月19日
 */
public class ConcreteBuilder extends Builder {

	private Product product = new Product(); 
	
	@Override
	public void buildPart1() {
		System.err.println("buildPart1 success.");
	}

	@Override
	public void buildPart2() {
		System.err.println("buildPart2 success.");
	}

	/**
	 * 返回最后组装成品结果
	 */
	@Override
	public Product retrieveResult() {
		System.err.println("product build.");
		return product;
	}

}
