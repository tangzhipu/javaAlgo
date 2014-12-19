package ouc.jeep.prototype.register;
/**
 * Description:
 * Author-jeep
 * Date-2014年12月19日
 */
public class ConcretePrototype implements Prototype{

	public synchronized Object clone(){
		Prototype temp = null;
		
		try{
			temp = (Prototype) super.clone();
			return temp;
		}catch(CloneNotSupportedException e){
			System.err.println("Clone failed.");
		}finally{
			return temp;
		}		
	} 

}
