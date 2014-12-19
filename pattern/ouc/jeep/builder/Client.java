package ouc.jeep.builder;
/**
 * Description: 建造模式是将复杂的内部创建封装在内部，对于外部调用的人来说，
				只需要传入建造者和建造工具，对于内部是如何建造成成品的，调用者无需关心.
 * Author-jeep
 * Date-2014年12月19日
 */
public class Client {

	private static Director director ;
	private static ConcreteBuilder builder ;
	
	public static void main(String[] args) {
		builder = new ConcreteBuilder();
		
		director = new Director(builder);
		director.construct();
		Product product = builder.retrieveResult();
		
	}
}
