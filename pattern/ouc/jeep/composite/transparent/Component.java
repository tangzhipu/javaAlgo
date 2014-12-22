package ouc.jeep.composite.transparent;

import java.util.Enumeration;

/** 透明式的合成模式结构
 * @description: 
 * @author: jeep
 * @date: 2014年12月22日
 */
public interface Component {

	void sampleOperation();
	
	Composite getComposite();
	
	void add(Component component);
	
	void remove(Component component);
	
	Enumeration components();
	
}
