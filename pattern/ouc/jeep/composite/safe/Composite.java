package ouc.jeep.composite.safe;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @description: 树枝构件角色
 * @author: jeep
 * @date: 2014年12月22日
 */
public class Composite implements Component{

	private Vector componentVector = new Vector();
	
	@Override
	public Composite getComposite() {
		return this;
	}

	@Override
	public void sampleOperation() {
		Enumeration enumeration = components();
		while(enumeration.hasMoreElements()){
			((Component)enumeration.nextElement()).sampleOperation();
		}
	}

	/**
	 * 聚集管理方法，增加一个构件子对象
	 * @param component
	 */
	public void add(Component component){
		componentVector.addElement(component);
	}
	
	/**
	 * 聚集管理方法，删除一个子构件对象
	 * @param component
	 */
	public void remove(Component component){
		componentVector.removeElement(component);
	}
	
	/**
	 * 返回聚集的Enumeration 对象
	 * @return
	 */
	public Enumeration components(){
		return componentVector.elements();
	}
}
