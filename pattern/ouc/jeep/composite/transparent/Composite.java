package ouc.jeep.composite.transparent;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @description: 
 * @author: jeep
 * @date: 2014年12月22日
 */
public class Composite implements Component{

	private Vector componentVector = new Vector();
	
	@Override
	public void sampleOperation() {
		Enumeration enumeration = components();
		while(enumeration.hasMoreElements()){
			((Component)enumeration.nextElement()).sampleOperation();
		}
	}

	@Override
	public Composite getComposite() {
		return this;
	}

	@Override
	public void add(Component component) {
		componentVector.addElement(component);
	}

	@Override
	public void remove(Component component) {
		componentVector.removeElement(component);
	}

	@Override
	public Enumeration components() {
		return componentVector.elements();
	}

}
