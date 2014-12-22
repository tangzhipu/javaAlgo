package ouc.jeep.composite.safe;
/** 安全是的合成模式结构
 * @description: 抽象构件角色
 * @author: jeep
 * @date: 2014年12月22日
 */
public interface Component {

	Composite getComposite();
	
	void sampleOperation();
}
