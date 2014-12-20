package ouc.jeep.defaultAdapter;
/**
 * @description: 缺省适配类:不准备实现一个接口的所有方法的时候，可以给出所有方法的平庸实现。
 * @author: jeep
 * @date: 2014年12月20日
 */
public abstract class ServiceAdapter implements AbstractService{

	@Override
	public void serviceOperation1() {
		
	}

	@Override
	public int serviceOperation2() {
		return 0;
	}

	@Override
	public String serviceOperation3() {
		return null;
	}

}
