package ouc.jeep.decorator;
/**
 * @description: 
 * @author: jeep
 * @date: 2014年12月22日
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;
    
    public Change(TheGreatestSage sage){
        this.sage = sage;
    }
    @Override
    public void move() {
        // 代码
        sage.move();
    }

}