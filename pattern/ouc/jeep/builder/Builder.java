package ouc.jeep.builder;
/**
 * Description:
 * Author-jeep
 * Date-2014年12月19日
 */
public abstract class Builder {

	/**
	 * 产品零件建造方法
	 */
	public abstract void buildPart1();
	
	/**
	 * 产品零件建造方法
	 */
	public abstract void buildPart2();
	
	/**
	 * 产品返回方法
	 * @return
	 */
	public abstract Product retrieveResult();
}
