package templete;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 12:36 AM 2019/6/19
 */
public class BaiduCompany extends Company {



    @Override
    protected void recruitment() {
        System.out.println("百度招聘 年薪50+");
    }

    @Override
    protected void induction() {
        System.out.println("在做人工智能呀!!!!");
    }
}
