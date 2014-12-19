package ouc.jeep.multition;

import java.util.Date;
import java.util.Random;

/**
 *	有上限的多例模式
 *
 * Date-2014年12月18日
 */
public class Die {

	private static Die die1 = new Die();
	private static Die die2 = new Die();
	
	private Die(){}
	
	/*
	 *  工厂方法
	 */
	public static Die getInstance(int whichOne){
		if(whichOne == 1){
			return die1;
		}else{
			return die2;
		}
	}
	
	/**
	 * 掷骰子，返回一个在1~6之间的随机数
	 * @return
	 */
	public synchronized int dice(){
		Date date = new Date();
		Random r = new Random(date.getTime());
		int value = r.nextInt();
		value = Math.abs(value);
		value = value % 6;
		value += 1;
		return value;
	}
}
