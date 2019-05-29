package decorate;


/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 4:35 PM 2019/5/29
 */
public class IPhone implements Phone {
	@Override
	public void call() {
		System.out.println("使用苹果手机打电话");
	}

}
