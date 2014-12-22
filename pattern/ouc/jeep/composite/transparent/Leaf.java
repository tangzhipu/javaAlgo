package ouc.jeep.composite.transparent;

import java.util.Enumeration;

/**
 * @description:  树叶类，给出了add(),remove()等方法的平庸实现，因为这些方法不适用于树叶类
 * @author: jeep
 * @date: 2014年12月22日
 */
public class Leaf implements Component{

	@Override
	public void sampleOperation() {
		// write your code here 
	}

	@Override
	public Composite getComposite() {
		return null;
	}

	@Override
	public void add(Component component) {
		
	}

	@Override
	public void remove(Component component) {
		
	}

	@Override
	public Enumeration components() {
		return null;
	}

}
