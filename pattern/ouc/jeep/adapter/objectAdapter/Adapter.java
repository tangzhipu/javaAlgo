package ouc.jeep.adapter.objectAdapter;
/**
 * @description: 
 * @author: jeep
 * @date: 2014年12月20日
 */
public class Adapter implements Target{

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		super();
		this.adaptee = adaptee;
	}
	
	/**
	 * 源类有方法，直接委派即可
	 */
	public void sampleOperation1() {
		this.adaptee.sampleOperation1();
	}

	/**
	 * 源类没有此方法
	 * 	因此由适配器类需要补充此方法 
	 */
	public void sampleOperation2() {
		//write your code here
	}

}
