package ouc.jeep.prototype.simple;
/**
 * Description: 简单形式的原型模型模式
 * Author-jeep
 * Date-2014年12月19日
 */
public class Client {

	private Prototype prototype;
	
	public void operation(Prototype example){
		Prototype p = (Prototype)example.clone();
	}
}
