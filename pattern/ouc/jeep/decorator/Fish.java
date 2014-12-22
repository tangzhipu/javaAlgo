package ouc.jeep.decorator;
/**
 * @description: 
 * @author: jeep
 * @date: 2014年12月22日
 */
public class Fish extends Change {
    
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Fish Move");
    }
}