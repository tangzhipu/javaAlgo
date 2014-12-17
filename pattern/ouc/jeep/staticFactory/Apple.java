package ouc.jeep.staticFactory;
/**
 *
 * Date-2014年12月17日
 */
public class Apple implements Fruit{
	
	private int treeAge;
	
	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

	@Override
	public void grow() {
		log("Apple is growing.....");
	}

	@Override
	public void harvest() {
		log("Apple has been harvested.");
	}

	@Override
	public void plant() {
		log("Apple has been planted.");
	}
	
	public static void log(String msg){
		System.err.println(msg);
	}

}
