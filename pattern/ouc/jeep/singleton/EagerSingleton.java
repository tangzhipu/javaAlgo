package ouc.jeep.singleton;
/**
 *	饿汉式单例类
 *
 * Date-2014年12月18日
 */
public class EagerSingleton {

	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
