package templete;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 12:36 AM 2019/6/19
 */
public class AlibabaCompany extends Company {



    @Override
    protected void recruitment() {
        System.out.println("阿里招聘 年薪50+");
    }

    @Override
    protected void induction() {
        System.out.println("来听马爸爸吹牛皮");
    }
}
