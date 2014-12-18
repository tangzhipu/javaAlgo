package ouc.jeep.singleton;
/**
 *	懒汉式单例类
 *
 * Date-2014年12月18日
 */
public class LazySingleton {

	private static LazySingleton instance = null;
	
	private LazySingleton(){}
	
	synchronized public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}
