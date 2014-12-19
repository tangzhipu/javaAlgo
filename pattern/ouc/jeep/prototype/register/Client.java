package ouc.jeep.prototype.register;
/**
 * Description: 登记形式的原型模型模式
 * Author-jeep
 * Date-2014年12月19日
 */
public class Client {

	private PrototypeManager pm;
	private Prototype prototype;
	
	public void registerPrototype(){
		prototype = new ConcretePrototype();
		Prototype copyPrototype = (Prototype) prototype.clone();
		pm.add(copyPrototype); 
	}
}
