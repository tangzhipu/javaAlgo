package ouc.jeep.prototype.register;

import java.util.Vector;

/**
 * Description:
 * Author-jeep
 * Date-2014年12月19日
 */
public class PrototypeManager {

	private Vector objects = new Vector();
	
	/**
	 * 增加一个新的对象
	 * @param object
	 */
	public void add(Prototype object){
		objects.add(object);
	}
	
	/**
	 * 取出聚集中的一个对象
	 * @param i
	 * @return
	 */
	public Prototype get(int i){
		return (Prototype) objects.get(i);
	}
	
	public int getSize(){
		return objects.size();
	}
}
