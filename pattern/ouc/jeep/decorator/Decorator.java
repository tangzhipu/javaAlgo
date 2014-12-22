package ouc.jeep.decorator;
/**
 * @description: Decorator 不是一个抽象类，但是由于它的功能是一个抽象角色，因此，常称为抽象装饰
 * @author: jeep
 * @date: 2014年12月22日
 */
public class Decorator implements Component{

	private Component component ;
	
	public Decorator(Component component){
		this.component = component;
	}
	
	public Decorator(){
		
	}
	
	/**
	 * 实现的方法委派给父类
	 */
	public void sampleOperation() {
		component.sampleOperation();
	}

}
