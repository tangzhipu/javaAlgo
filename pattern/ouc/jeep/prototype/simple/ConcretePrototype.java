package ouc.jeep.prototype.simple;
/**
 * Description:
 * Author-jeep
 * Date-2014年12月19日
 */
public class ConcretePrototype implements Prototype{
	
	public Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			return null;
		}
	}
}
