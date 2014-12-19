package ouc.jeep.builder;
/**
 * Description:
 * Author-jeep
 * Date-2014年12月19日
 */
public class Director {

	private Builder builder; 
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	/**
	 * 产品构造方法，负责调用各个零件建造方法
	 */
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
	}
}
