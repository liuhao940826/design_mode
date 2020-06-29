package templete.variation;

import templete.variation.model.BaseScheduleBo;

/**
 * @Classname TestProcess
 * @Description TODO
 * @Date 2020/6/29 3:04 下午
 * @Created by liuhao
 */
public class TestProcess1 {

    public static void main(String[] args) {

        AbstractTemplete abstractTemplete = new AbstractTemplete() {
            @Override
            protected Object schedule() {

                System.out.println("schedule task 1");

                return new BaseScheduleBo();
            }

            @Override
            protected void sendMsg() {
                System.out.println("send msg 1");

            }
        };

        abstractTemplete.override();


    }
}
