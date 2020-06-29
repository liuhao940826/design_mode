package templete.variation;

import templete.variation.model.BaseScheduleBo;

/**
 * @Classname AbstractTemplete
 * @Description TODO
 * @Date 2020/6/29 2:50 下午
 * @Created by liuhao
 */
public abstract class AbstractTemplete {

    protected void override(){

        System.out.println("default, implents");

        Object scheduleResult = schedule();

        if(scheduleResult instanceof BaseScheduleBo){
            sendMsg();
        }else {
            System.out.println("not send msg");
        }
    }

    protected abstract Object schedule ();

    protected abstract void sendMsg();

}
